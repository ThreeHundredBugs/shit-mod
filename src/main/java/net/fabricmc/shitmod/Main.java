package net.fabricmc.shitmod;

import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer
{

	@Override
	public void onInitialize()
	{
		new RegisterItems();
	}
}
