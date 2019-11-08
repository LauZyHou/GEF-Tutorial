package gef.tutorial.step.parts;

import gef.tutorial.step.model.HelloModel;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

//控制器：xxEditPart
public class HelloEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		// 在这里用Draw2D的函数作图，在Label上写模型中的文字
		HelloModel model = (HelloModel) getModel();
		Label label = new Label();
		label.setText(model.getText());
		return label;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

}
