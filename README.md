# attrs-view

Allow annotate attrs for code-gen views.


## Usage

```java
SimpleView extends View {
  @ColorAttr("text_color")
  int textColor;
  
  public void setTextColor(int color) {
    textColor = color;
  }
}
```

```xml
<attrs.SimpleViewAttrs
  app:text_color="#0000"
/>
```

```java
SimpleView simpleView = (SimpleView) findViewById(R.id.simple_view);
simpleView.setColor(Color.parse("#ffff"));
```
