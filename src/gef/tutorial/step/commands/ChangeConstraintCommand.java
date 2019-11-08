package gef.tutorial.step.commands;

import gef.tutorial.step.model.HelloModel;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

//因为改变图形大小和调整图形位置都是和约束(constraint)相关的，所以只要创建这个改变约束的命令(command)
public class ChangeConstraintCommand extends Command {
	private HelloModel helloModel;// 本命令所作用的模型
	private Rectangle constraint; // 要改变为的，新的约束

	// 在这里改变模型的约束，也就是为模型重新设置约束为这个新约束
	@Override
	public void execute() {
		helloModel.setConstraint(constraint);
	}

	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
	}

	public void setModel(Object model) {
		this.helloModel = (HelloModel) model;
	}

}
