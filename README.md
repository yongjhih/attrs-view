# attrs-view

Allow annotate attrs for code-gen views.


## Usage

```java
SimpleView extends View {
  @ColorAttr("text_color")
  int textColor;
}
```

```xml
<attrs.SimpleViewAttrs
  app:text_color="#0000"
/>
```

## Development

```java
// Generated SimpleViewAttrs
SimpleViewAttrs extends SimpleView {

  public SimpleViewAttrs(@NonNull Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init(context.obtainStyledAttributes(attrs, R.styleable.SimpleView));
  }

  private void init(TypedArray attrs) {
    textColor = attrs.getColor(R.styleable.SimpleView_text_color, textColor);
  }

}
