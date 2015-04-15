package co.uk.sentinelweb.depop.test.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import co.uk.sentinelweb.depop.test.model.Header;
import co.uk.sentinelweb.depop.test.model.PictureData;
import co.uk.sentinelweb.depop.test.utils.img.CircleTransform;
import depop.test.sentinelweb.uk.co.test.R;

/**
 * Header view for Viewing Use
 * Created by robert on 14/04/2015.
 */
public class UserHeaderView extends RelativeLayout {
    /** model object */
    Header mHeader;
    /** the user icon */
    private ImageView mIconView;
    /** the user name text */
    private TextView mName;
    /** the user followers text */
    private TextView mFollowers;
    /** the user following text  */
    private TextView mFollowing;
    /** the user review text */
    private TextView mReviews;
    /** the user rating bar */
    private RatingBar mRating;
    /** the user link text */
    private TextView mLink;
    /** the user description text */
    private TextView mDescription;


    public UserHeaderView(final Context context) {
        super(context);
        init(context,null,0,0);
    }

    public UserHeaderView(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs,0,0);
    }

    public UserHeaderView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs,defStyleAttr,0);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public UserHeaderView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs,defStyleAttr,defStyleRes);


    }

    /**
     * Initialise the view.
     * @param context
     * @param attrs
     * @param defStyleAttr
     * @param defStyleRes
     */
    private void init(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        layoutInflater.inflate(R.layout.view_user_header, this);

        mIconView = (ImageView) findViewById(R.id.user_header_icon);
        mName = (TextView) findViewById(R.id.user_header_name);
        mFollowers = (TextView) findViewById(R.id.user_header_follower_count);
        mFollowing = (TextView) findViewById(R.id.user_header_following_count);
        mReviews = (TextView) findViewById(R.id.user_header_reviews_count);
        mRating = (RatingBar) findViewById(R.id.user_header_rating);
        mLink = (TextView) findViewById(R.id.user_header_link);
        mDescription = (TextView) findViewById(R.id.user_header_description);

        // if i was adding attribute to this view i would do it like this and declare then in attr.xml
//        TypedArray a = context.getTheme().obtainStyledAttributes(
//                attrs,
//                R.styleable.UserHeaderView,
//                defStyleAttr, defStyleRes);
//
//        try {
//            if (a != null) {
//                int n = a.getIndexCount();
//                for (int i = 0; i < n; i++) {
//                    int attr = a.getIndex(i);
//                    String string;
//                    switch (attr) {
//                        case R.styleable.UserHeaderView_svg:
//                            string = a.getString(attr);
//                            if (string != null) {
//                                Drawable drawable = SVGDrawingCache.makeDrawable(getContext(), string, 24, SVGDrawingCache.blackModifier);
//                                mIconView.setImageDrawable(drawable);
//                            }
//                            break;
//
//                        case R.styleable.UserHeaderView_label:
//                            string = a.getString(attr);
//                            if (string != null) _labelView.setText(string);
//                            break;
//
//                        case R.styleable.UserHeaderView_data:
//                            string = a.getString(attr);
//                            if (string != null) _dataView.setText(string);
//                            break;
//
//                    }
//                    string=null;
//                }
//            }
//        } finally {
//            a.recycle();
//        }

    }

    /**
     * Set the header model object
     * @param header
     */
    public void setHeader(final Header header) {
        mHeader=header;
        updateFields();
    }

    /**
     * Update the view fields
     */
    private void updateFields() {
        if (mHeader!=null) {
            mName.setText(new StringBuilder().append(mHeader.getFirstName()).append(" ").append(mHeader.getLastName()).toString());
            mFollowers.setText(new StringBuilder().append(Integer.toString(mHeader.getFollowersCount()).toString()));
            mFollowing.setText(new StringBuilder().append(Integer.toString(mHeader.getFollowingCount()).toString()));
            mReviews.setText(getResources().getString(R.string.reviews, Integer.toString(mHeader.getAcquiredCount())));
            final String website = mHeader.getWebsite();
            if (website!=null) {
                SpannableString content = new SpannableString(website);
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                mLink.setText(content);
                mLink.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(website));
                        getContext().startActivity(i);
                    }
                });
            } else {
                mLink.setVisibility(GONE);
                mLink.setOnClickListener(null);
            }
            mDescription.setText(mHeader.getBio());
            PictureData pictureData = mHeader.getPictureData();
            if (pictureData !=null) {
                // the picture is in an AWS bucket so substituting for straight URL
                //picture = "https://plus.google.com/u/0/_/focus/photos/public/AIbEiAIAAABECKm_-pfT_9qjsQEiC3ZjYXJkX3Bob3RvKigyNGE5ZWE5ZTZmNmQ3NDU0NzFkZmU1Y2FiMjcxZGFmMGIzZGRmMmZjMAHKYoQBKWedVUsyWnW9iMgZAE_Nbg?sz=48";
                if (pictureData.getFormats().getU0()!=null) {
                    String picture = pictureData.getFormats().getU0().getUrl();
                    Picasso.with(getContext()).load(picture).transform(new CircleTransform()).into(mIconView);
                }


            } else {
                mIconView.setBackgroundColor(getResources().getColor(R.color.blue_grey_500));
            }
        }
    }
}
