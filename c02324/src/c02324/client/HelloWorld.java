package c02324.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;

public class HelloWorld {
	interface HelloWorldUiBinder extends UiBinder<DivElement, HelloWorld> {}
	private static HelloWorldUiBinder uiBinder = GWT.create(HelloWorldUiBinder.class);

	private DivElement root;
	@UiField SpanElement nameSpan;	

	public HelloWorld() {
//		initWidget(uiBinder.createAndBindUi(this));
		root = uiBinder.createAndBindUi(this);
	}
	
	public Element getElement(){
		return root;
	}
	
	public void setName(String name){
		nameSpan.setInnerText(name);
	}
}
