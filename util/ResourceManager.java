package util;

import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class ResourceManager
{
	public Texture TERRAIN_MAP;
	public Texture WHITE_MAP;
	
	public Texture TOOLBAR;
	
	public Texture BTN_PLANE;
	
	public ResourceManager()
	{
		try
		{
			TERRAIN_MAP = TextureLoader.getTexture("JPG", ResourceLoader.getResourceAsStream("assets/textures/terrain/Earth_Terrain_1080.jpg")); 
			WHITE_MAP = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("assets/textures/white/Earth_White_1080.png"));
			
			TOOLBAR = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("assets/textures/gui/Toolbar.png"));
			
			BTN_PLANE = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("asssets/textures/gui/buttons/Plane.png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}