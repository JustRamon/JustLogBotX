package tk.justramon.ircbot.justabotx;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;

public class Channels
{
	private static File chanfile = new File("channels" + ".txt");
	public static void joinAll(PircBotX bot) throws IOException
	{
		if(!chanfile.exists())
			chanfile.createNewFile();
		
		List<String> channels = FileUtils.readLines(chanfile);
		for(String line : channels)
		{
			bot.sendIRC().joinChannel(line);
		}
	}
}
