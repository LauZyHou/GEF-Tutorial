package gef.tutorial.step.parts;

import gef.tutorial.step.model.HelloModel;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

//用于连接模型xxModel和控制器xxEditPart的工厂
public class PartFactory implements EditPartFactory {

	// (1)首先根据模型创建其控制器
	private EditPart getPartForElement(Object modelElement) {
		// 根据模型的类型返回一个控制器对象
		if (modelElement instanceof HelloModel)
			return new HelloEditPart();
		// 如果提供的模型类型在上面没有找到，抛掷异常
		throw new RuntimeException("Can't create part for model Element:"
				+ ((modelElement != null) ? modelElement.getClass() : "null"));

	}

	// (2)然后连接模型和控制器
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		// 先获取模型的控制器对象
		EditPart part = getPartForElement(model);
		// 为控制器对象存储这个模型，然后返回控制器对象
		part.setModel(model);
		return part;
	}
}
