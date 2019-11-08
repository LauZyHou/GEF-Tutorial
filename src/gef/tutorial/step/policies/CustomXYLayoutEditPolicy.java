package gef.tutorial.step.policies;

import gef.tutorial.step.commands.ChangeConstraintCommand;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

//为了改变图形尺寸和位置，创建继承了XYLayoutEditPolicy的Policy
//Policy用于管理一些处理请求的Command命令，Policy会被安装到控制器EditPart
public class CustomXYLayoutEditPolicy extends XYLayoutEditPolicy {

	@Override
	protected Command createAddCommand(EditPart child, Object constraint) {
		// TODO Auto-generated method stub
		return null;
	}

	// XYLayoutEditPolicy 的 getCommand 方法得到的请求类型是 REQ_MOVE_CHILDREN 或
	// REQ_RESIZE_CHILDREN 时
	// 就会执行 createChangeConstraintCommand
	@Override
	protected Command createChangeConstraintCommand(EditPart child,
			Object constraint) {
		// 新建自定的那个命令对象
		ChangeConstraintCommand command = new ChangeConstraintCommand();
		// 设置模型和约束
		command.setModel(child.getModel());
		command.setConstraint((Rectangle) constraint);
		// 然后将创建好的command对象返回
		return command;
	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Command getDeleteDependantCommand(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

	// 获取到命令，如在图形上尝试拖动或者尝试调整尺寸时就会发出Command
	@Override
	public Command getCommand(Request request) {
		// 打印出调用的Command，如调整尺寸时输出"resize children"
		System.out.println(request.getType());
		return super.getCommand(request);
	}

}
