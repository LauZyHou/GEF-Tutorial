package gef.tutorial.step.parts;

import gef.tutorial.step.model.ContentsModel;
import gef.tutorial.step.policies.CustomXYLayoutEditPolicy;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.gef.EditPolicy;
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

	// 在这里安装Policy
	@Override
	protected void createEditPolicies() {
		// 第一个参数：字符串，指定安装的editing policy的角色role
		// 一个edit part可以安装很多policy，如果有的role相同，那么就只有最后一个有效
		// 实际上这个字符串可以取任意值
		// 第二个参数：要安装的policy的对象
		installEditPolicy(EditPolicy.LAYOUT_ROLE,
				new CustomXYLayoutEditPolicy());

	}

	// 获取本模型的子模型列表
	@Override
	protected List getModelChildren() {
		return ((ContentsModel) getModel()).getChildren();
	}

}
