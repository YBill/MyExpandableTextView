## 在[Manabu-GT/ExpandableTextView](https://github.com/Manabu-GT/ExpandableTextView.git)上对原有的项目进行了修改

# ExpandableTextView 用法

## XML

```
<com.myexpandabletextview.ExpandableTextView
        android:id="@+id/expand_text_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#ffffff"
        android:orientation="horizontal"
        expandableTextView:collapseDrawable="@mipmap/icon_expand_text_close"
        expandableTextView:collapseMsg="收起"
        expandableTextView:expandDrawable="@mipmap/icon_expand_text_open"
        expandableTextView:expandMsg="展开"
        expandableTextView:maxCollapsedLines="4">

        <TextView
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:textColor="#666666"
            android:textSize="16sp"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="end|bottom"
            android:drawablePadding="5dp"
            android:textColor="#00ffff"/>
            
</com.myexpandabletextview.ExpandableTextView>
```

```
<declare-styleable name="ExpandableTextView">
        <attr name="maxCollapsedLines" format="integer"/> // 最大行数 def:8
        <attr name="animDuration" format="integer"/> // 展开/收起动画时长ms def:300
        <attr name="animAlphaStart" format="float"/> // 动画开始时的默认Alpha值 def:0.7f
        <attr name="expandDrawable" format="reference"/> // 收起时icon
        <attr name="collapseDrawable" format="reference"/> // 展开时icon
        <attr name="expandMsg" format="string"/> // 收起时name
        <attr name="collapseMsg" format="string"/> // 展开时name
        <attr name="showEnd" format="boolean"/> // 是否可以收起 def:true
</declare-styleable>
```

 > ExpandableTextView中必须包含两个TextView，第一个是正文，第二个是展开/收起 文字或icon
 
##  Api

### 1、获取文本内容

```
public CharSequence getText() {
    
}
```

### 2、设置文本内容

```
public void setText(@Nullable CharSequence text) { 
    
}
```

### 3、设置文本内容，在列表中（RecyclerView/ListView）

```
public void setText(@Nullable CharSequence text, @NonNull SparseBooleanArray collapsedStatus, int position) {
    
}
```

### 4、展开/收起 回调

```
public void setOnExpandStateChangeListener(@Nullable OnExpandStateChangeListener listener) {
        
}
```

## eg:
![image](https://raw.githubusercontent.com/YBill/MyExpandableTextView/master/screenshots/sr_1.gif)
