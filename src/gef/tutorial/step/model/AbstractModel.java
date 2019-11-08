package gef.tutorial.step.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

//模型有责任将自己的改变通知EditPart，因为对所有的模型都要通知对应的EditPart，所以设置这个抽象父类
abstract public class AbstractModel {
	// listener列表
	private PropertyChangeSupport listeners = new PropertyChangeSupport(this);

	// 在列表中添加listener(其实就是控制器把自己加进来)
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		listeners.addPropertyChangeListener(listener);
	}

	// 通知控制器模型发生了改变(也就是要对listener列表中所有的监听控制器发通知)
	public void firePropertyChange(String propName, Object oldValue,
			Object newValue) {
		listeners.firePropertyChange(propName, oldValue, newValue);
	}

	// 从列表中移除给定的listener(其实就是控制器把自己删掉)
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		listeners.removePropertyChangeListener(listener);
	}
}
