package gef.tutorial.step.parts;

import gef.tutorial.step.model.HelloModel;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

//控制器：xxEditPart
public class HelloEditPart extends AbstractGraphicalEditPart {

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

}
