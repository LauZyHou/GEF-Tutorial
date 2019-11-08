package gef.tutorial.step.model;

import java.util.ArrayList;
import java.util.List;

//图形集模型ContentsModel
public class ContentsModel {
	// 子模型列表
	private List children = new ArrayList();

	// 添加子模型
	public void addChild(Object obj) {
		children.add(obj);
	}

	// 获得子模型
	public List<Object> getChildren() {
		return children;
	}
}
