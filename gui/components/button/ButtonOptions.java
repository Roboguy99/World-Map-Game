package gui.components.button;

import main.Main;

public class ButtonOptions extends Button 
{
	public ButtonOptions(int height, String text) 
	{
		super(height, text);
	}

	@Override
	protected void click() 
	{
		//Begin drawing the correct components and stop the unneeded ones
		Main.instanceManager.menuInstance.draw = false;
		Main.instanceManager.optionsInstance.draw = true;
	}
}
