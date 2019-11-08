package gef.tutorial.step.model;

import org.eclipse.draw2d.geometry.Rectangle;

//模型：xxModel，这里继承自定的抽象类，以提供监听者列表和通知监听器(这里是控制器)发生变化
public class HelloModel extends AbstractModel {
	private String text = "Hello World!";
	// 约束，用于指出图形在图形集中的位置和大小，约束是和实际业务无关的
	private Rectangle constraint;
	// 这个字符串用于指示模型变化时，变化的类型
	public static final String P_CONSTRAINT = "_constraint";

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
		// 通知控制器，约束(这里也就是图形的位置或者尺寸)发生了变化，旧的值(第二参数)并不在意，不妨给null
		firePropertyChange(P_CONSTRAINT, null, constraint);
	}

}
