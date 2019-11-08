package gef.tutorial.step.model;

import org.eclipse.draw2d.geometry.Rectangle;

//模型：xxModel
public class HelloModel {
	private String text = "Hello World!";
	// 约束，用于指出图形在图形集中的位置和大小，约束是和实际业务无关的
	private Rectangle constraint;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Rectangle getConstraint() {
		return constraint;
	}

	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
	}

}
