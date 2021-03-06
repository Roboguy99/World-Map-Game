package gui.components.button.options.menu;

import gui.components.button.Button;
import main.Main;

public class ButtonMenuReturn extends Button 
{
	public ButtonMenuReturn(int height, String text) 
	{
		super(height, text);
	}

	@Override
	protected void click() 
	{	
		//Begin drawing the correct components and stop the unneeded ones
		Main.instanceManager.optionsInstance.draw = false;
		Main.instanceManager.menuInstance.draw = true;
	}
}
