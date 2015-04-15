package co.uk.sentinelweb.depop.test.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.nineoldandroids.view.ViewHelper;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import co.uk.sentinelweb.depop.test.client.RestClient;
import co.uk.sentinelweb.depop.test.model.Header;
import co.uk.sentinelweb.depop.test.model.PictureFormats;
import co.uk.sentinelweb.depop.test.model.Product;
import co.uk.sentinelweb.depop.test.model.Products;
import co.uk.sentinelweb.depop.test.view.UserHeaderView;
import depop.test.sentinelweb.uk.co.test.R;

/**
 * The Fragment to display user data
 * Created by robert on 14/04/2015.
 */
public class ViewUserFragment extends Fragment {
    public static final String ARG_ID = "userId";
    /** the user id */
    Long mId;
    /** Header data object */
    Header mHeader;
    /** the header view */
    UserHeaderView mUserHeaderView;
    /** Tabhost */
    TabHost mTabHost;
    /** View pager */
    ViewPager mViewPager;
    /** pager views*/
    ArrayList<View> mPagerViewsArray;
    /** pager views*/
    List<String> mTabsNames = null;
    /** Products Selling Grid view */
    RecyclerView mSellGridView;
    /** Products Liked Grid view */
    RecyclerView mLikesGridView;
    /** the currently visible view */
    RecyclerView mCurrentView;
    // Testing data
    Products mProducts;
    /** grid layout manager for recylerview */
    GridLayoutManager mSellGridLayoutManager;
    /** grid layout manager for recylerview */
    GridLayoutManager mLikesGridLayoutManager;

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!=null) {
            if (getArguments().containsKey(ARG_ID)) {
                mId = getArguments().getLong(ARG_ID);
            }
        }
        mTabsNames = Arrays.asList(new String[]{getActivity().getString(R.string.tab_selling), getActivity().getString(R.string.tab_likes)});
    }

    @Override
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_user, container, false);
        mUserHeaderView = (UserHeaderView)rootView.findViewById(R.id.view_user_header);
        mTabHost = (TabHost)rootView.findViewById(R.id.view_user_tabhost);
        mViewPager = (ViewPager)rootView.findViewById(R.id.view_user_viewpager);

        mSellGridView = (RecyclerView)rootView.findViewById(R.id.view_user_selling);
        mSellGridLayoutManager = new GridLayoutManager(getActivity(),getResources().getInteger(R.integer.cols));
        mSellGridView.setLayoutManager(mSellGridLayoutManager);
        mSellGridView.setOnScrollListener(new GridViewScrollListener());

        mCurrentView = mSellGridView;

        mLikesGridView = (RecyclerView)rootView.findViewById(R.id.view_user_likes);
        mLikesGridLayoutManager = new GridLayoutManager(getActivity(),getResources().getInteger(R.integer.cols));
        mLikesGridView.setLayoutManager(mLikesGridLayoutManager);


        // intialise viewpager
        mPagerViewsArray= new ArrayList<>();
        mPagerViewsArray.add(mSellGridView);;
        mPagerViewsArray.add(mLikesGridView);
        mViewPager.setAdapter(new ViewPagerAdapter());

        mViewPager.setOnPageChangeListener(new ViewPagerPageChangeListener());

        initTabs();
        return rootView;
    }

    @Override
    public void onDestroyView() {
        mUserHeaderView = null;
        mTabHost = null;
        mViewPager = null;
        mSellGridView = null;
        mLikesGridView = null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onStart() {
        super.onStart();
        if (mHeader==null) {
            loadHeaderData();
        }
        if (mProducts==null) {
            loadProductsData();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    private void loadHeaderData() {
        RestClient.getHeaderAsync(getActivity(), mId, new RestClient.HeaderCallback() {

            @Override
            public void onComplete(final Header header) {
                mHeader = header;
                mUserHeaderView.setHeader(mHeader);
            }

            @Override
            public void onError(Exception e) {

            }
        });
    }

    private void loadProductsData() {
        RestClient.getProductsAsync(getActivity(), mId, new RestClient.ProductsCallback() {

            @Override
            public void onComplete(final Products products) {
                mProducts = products;
                if (mProducts != null) {
                    //dumpProducts();
                    // populate lists
                    mSellGridView.setAdapter(new ProductsAdapter());
                    mLikesGridView.setAdapter(new ProductsAdapter());
                    //mTabHost.setVisibility(View.VISIBLE);
                    setScroll(0);
                } else {
                    mSellGridView.setAdapter(null);
                    mLikesGridView.setAdapter(null);
                    Log.d("products", "products not loaded:");
                }
            }

            @Override
            public void onError(Exception e) {

            }
        });
    }

    private class ViewPagerPageChangeListener implements ViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(final int position) {
            mTabHost.setCurrentTab(position);
            mCurrentView=(RecyclerView) mPagerViewsArray.get(position);
        }

        @Override
        public void onPageScrollStateChanged(final int state) {

        }
    };



    /** This manages the views in the view pager */
    private class ViewPagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return mPagerViewsArray.size();
        }

        @Override
        public boolean isViewFromObject(final View view, final Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(final ViewGroup collection, final int position) {
            return mPagerViewsArray.get(position);
        }

        @Override
        public void destroyItem(final ViewGroup collection, final int position, final Object view) {
            ((ViewPager) collection).removeView((View) view);
        }
    };



    /**
     * Scroll listener for the GridViews. There is also another project called ObservableScrollView
     * on Github which can be used to Listen for scrolling - which may produce smoother scrolling but i haven't tested it.
     * Dragging slowly can produce touch noise where the touch position jumps looking a the touch history object can smooth the noise.
     */
    private class GridViewScrollListener extends RecyclerView.OnScrollListener {
        /** Keep a sum of dy available for the scroll value */
        float scrollY = 0;

        public void onScrollStateChanged(final RecyclerView recyclerView, final int newState){

        }

        /**
         * Callback method to be invoked when the RecyclerView has been scrolled. This will be
         * called after the scroll has completed.
         *
         * @param recyclerView The RecyclerView which scrolled.
         * @param dx The amount of horizontal scroll.
         * @param dy The amount of vertical scroll.
         */
        public void onScrolled(final RecyclerView recyclerView, final int dx, final int dy) {
            scrollY += dy;
            if (mCurrentView == recyclerView && recyclerView.getChildCount() > 0) {
                final int thisScrollY = (int) scrollY;
                setScroll(thisScrollY);
            }
        }
    }

    private void setScroll(final int thisScrollY) {
        int headerHeight = mUserHeaderView.getHeight();
        final int headerTop;
        if (headerHeight > thisScrollY) {
            headerTop = -thisScrollY;
        } else {
            headerTop = -headerHeight;
        }
        ViewHelper.setTranslationY(mUserHeaderView, headerTop);
        ViewHelper.setTranslationY(mTabHost, headerTop + headerHeight);
    }


    // Tabs
    /**
     * Initialise tabs
     */
    private void initTabs () {
        mTabHost.setup();
        for (String tabTag : mTabsNames) {
            final TabHost.TabSpec tabSpec = mTabHost.newTabSpec(tabTag).setIndicator(tabTag);
            tabSpec.setContent(new TabFactory());
            mTabHost.addTab(tabSpec);
        }

        mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(final String tag) {
                if (mViewPager != null && mViewPager.getAdapter() != null) {
                    mViewPager.setCurrentItem(mTabsNames.indexOf(tag));
                }
            }
        });
    }

    private class TabFactory implements TabHost.TabContentFactory {
        /**
         * Creates tab content
         * @param tag
         * @return
         */
        public View createTabContent(final String tag) {
            final TextView v = new TextView(getActivity());
            v.setMinimumWidth(0);
            v.setMinimumHeight(0);
            return v;
        }
    }

    /**
     * Debugging function for product list
     */
    private void dumpProducts() {
        Log.d("products", "prodcount:" + mProducts.getObjects().size());
        for (Product product : mProducts.getObjects()) {
            Log.d("products", "prod:" + product.getDescription());
            for (PictureFormats formats : product.getPicturesData()) {
                if (formats.getFormats().getP0()!=null) {
                    Log.d("products", "format:" + formats.getFormats().getP0().getUrl());
                } else {
                    Log.d("products", "no format:" );
                }
            }
        }
    }

    /**
     * Adapter for the recyclerview
     */
    public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {

        public class ViewHolder extends RecyclerView.ViewHolder {
            // each data item is just a string in this case
            public ImageView mImageView;
            public ViewHolder(ImageView v) {
                super(v);
                mImageView = v;
            }
        }

        @Override
        public ProductsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // create a new view
            final View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.grid_tile, parent, false);

            // create the view holder
            ViewHolder vh = new ViewHolder((ImageView)v);
            return vh;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            final Product p = mProducts.getObjects().get( position);
            final String picture = p.getPicturesData().get(0).getFormats().getP0().getUrl();
            Picasso.with(getActivity()).load(picture).into((ImageView) holder.mImageView);
            holder.mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(), getString(R.string.click, p.getDescription()), Toast.LENGTH_LONG).show();
                }
            });

        }
        @Override
        public int getItemCount() {
            return mProducts.getObjects().size();
        }
    }
}
