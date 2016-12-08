package attrsview.app.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.util.AttributeSet;
import android.view.View;
import attrsview.app.R;

/**
 * Created by jasonni on 12/5/16.
 */

public class SimpleView extends View {

  private static final String TAG = "SimpleView";

  private final CharSequence mText;
  private final @ColorInt int mColor;

  public SimpleView(Context context, AttributeSet attrs) {
    super(context, attrs);
    TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.simple);

    mText = typedArray.getText(R.styleable.simple_attrs_view_text);
    mColor = typedArray.getColor(R.styleable.simple_attrs_view_text_color, Color.WHITE);

    typedArray.recycle();
  }

  public CharSequence getText() {
    return mText;
  }

  public int getColor() {
    return mColor;
  }
}
