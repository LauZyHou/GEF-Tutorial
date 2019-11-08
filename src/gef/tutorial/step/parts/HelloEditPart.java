package gef.tutorial.step.parts;

import gef.tutorial.step.model.HelloModel;

import java.beans.PropertyChangeEvent;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;

//控制器：xxEditPart，这里改成继承自定的抽象类以完成监听
public class HelloEditPart extends EditPartWithListener {

	@Override
	protected IFigure createFigure() {
		// 在这里用Draw2D的函数作图，在Label上写模型中的文字
		HelloModel model = (HelloModel) getModel();
		Label label = new Label();
		label.setText(model.getText());
		// 设置边框、背景色和不透明
		label.setBorder(new CompoundBorder(new LineBorder(),
				new MarginBorder(3)));
		label.setBackgroundColor(ColorConstants.orange);
		label.setOpaque(true);
		return label;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

	// 将模型中定义的约束施加给图形
	@Override
	protected void refreshVisuals() {
		Rectangle constraint = ((HelloModel) getModel()).getConstraint();
		((GraphicalEditPart) getParent()).setLayoutConstraint(this,
				getFigure(), constraint);
	}

	// 属性发生变化时此函数被调用
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// 通过判断事件中改变的属性名，来知道改变的是控制器控制的哪种模型的哪个属性
		// 这里就是唯一的HelloModel的constrant约束属性
		if (event.getPropertyName().equals(HelloModel.P_CONSTRAINT)) // 约束发生变化，源于尺寸位置请求变化
			refreshVisuals();// 刷新视图，以看到尺寸位置的变化

	}

}
