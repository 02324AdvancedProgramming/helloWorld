package c02324.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class HelloWidgetWorld extends Composite {
	interface HelloWidgetWorldUiBinder extends UiBinder<Widget, HelloWidgetWorld> { }
	private static HelloWidgetWorldUiBinder uiBinder = GWT.create(HelloWidgetWorldUiBinder.class);
	
//	public HelloWidgetWorld() {
//		initWidget(uiBinder.createAndBindUi(this));
//	}
	
	@UiField ListBox listBox;

	  public HelloWidgetWorld(String... names) {
	    // sets listBox
	    initWidget(uiBinder.createAndBindUi(this));
	    for (String name : names) {
	      listBox.addItem(name);
	    }
	  }

//	@UiField
//	Button button;
//
//	public HelloWidgetWorld(String firstName) {
//		initWidget(uiBinder.createAndBindUi(this));
//		button.setText(firstName);
//	}
//
//	@UiHandler("button")
//	void onClick(ClickEvent e) {
//		Window.alert("Hello!");
//	}
//
//	public void setText(String text) {
//		button.setText(text);
//	}
//
//	public String getText() {
//		return button.getText();
//	}

}
