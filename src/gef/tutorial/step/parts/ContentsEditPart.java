package gef.tutorial.step.parts;

import gef.tutorial.step.model.ContentsModel;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

//ContentsModel的控制器
public class ContentsEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		// Draw2D的Layer 透明图层
		Layer figure = new Layer();
		// 引入了图层，就要设置图层的布局才能正常显示图层
		figure.setLayoutManager(new XYLayout());// XYLayout布局允许自由移动图形
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

	// 获取本模型的子模型列表
	@Override
	protected List getModelChildren() {
		return ((ContentsModel) getModel()).getChildren();
	}

}
