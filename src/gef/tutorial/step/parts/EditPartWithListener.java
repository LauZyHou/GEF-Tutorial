package gef.tutorial.step.parts;

import gef.tutorial.step.model.AbstractModel;

import java.beans.PropertyChangeListener;

import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

//控制器总要监听模型的改变，所以创建这样一个抽象类
abstract public class EditPartWithListener extends AbstractGraphicalEditPart
		implements PropertyChangeListener {

	// 在这里注册监听器(即把自己写入模型的监听器列表)
	@Override
	public void activate() {
		super.activate();
		// 将自己注册为监听器(传入的参数是this)
		((AbstractModel) getModel()).addPropertyChangeListener(this);
	}

	// 在这里删除监听器(即把自己从模型的监听器列表中删除)
	@Override
	public void deactivate() {
		super.deactivate();
		// 将自己监听器删除
		((AbstractModel) getModel()).removePropertyChangeListener(this);
	}
}
