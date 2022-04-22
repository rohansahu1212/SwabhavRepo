package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class HtmlDomGroupElement implements HtmlElement {
	private String tagName;
	private List<HtmlElement> elements = new ArrayList<HtmlElement>();

	public HtmlDomGroupElement(String tagName) {
		this.tagName = tagName;
	}

	public void addChild(HtmlElement item) {
		elements.add(item);

	}

	@Override
	public String render() {
		String dom = "";
		// System.out.println("<"+tagName+">");
		dom = "<" + tagName + ">";
		for (HtmlElement ele : elements)
			dom+="\n"+ele.render();
		dom+= "\n"+"</" + tagName + ">";
		return dom;

	}

}
