package me.Hazim.io;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
        Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)this);
        getLogger().log(Level.INFO, "*************************************");
        getLogger().log(Level.INFO, "Emotes Chat Enabled! Made by Hazim ");
        getLogger().log(Level.INFO, "For Support DM on Discord Hazim#3260");
        getLogger().log(Level.INFO, "Please Support by rating 5 Star on Spigot!");
        getLogger().log(Level.INFO, "************************************");
        this.getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();
        
        
	
		
	}
	



	@Override
	public void onDisable() {
		
		super.onDisable();
	}
	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("emojis")) {
			Player p = (Player) sender;
			String heart = ChatColor.RED + "\u2764";
			String star = ChatColor.GOLD + "\u2605";
			String yes = ChatColor.GREEN + "\u2713";
			String no = ChatColor.RED + "\u2716";
			String java = ChatColor.AQUA + "\u2615";
			String arrow = ChatColor.YELLOW + "\u279C";
			String shrug = ChatColor.YELLOW + "\u00AF\\_(\u30c4)_/\u00AF";
			String tableflip = ChatColor.RED + "(\u256F\u00B0\u25A1\u00B0)\u256F" + ChatColor.WHITE + "\uFE35 \u253B\u2501\u253B";
			String hi = ChatColor.LIGHT_PURPLE + "( \uFF9F\u25E1\uFF9F)/";
			String onetwothree = ChatColor.GREEN + "1" + ChatColor.YELLOW + "2" + ChatColor.RED + "3";
			String totem = ChatColor.AQUA + "\u2609" + ChatColor.YELLOW + "_" + ChatColor.AQUA +"\u2609";
			String typing = ChatColor.YELLOW + "\u270E...";	
			String maths = "&a&l\u221A&e&l(&a&l\u03C0&e&l+&a&lx&e&l)&a&l=&c&lL";
			String snail = "&e@&a'&e-&a'";
			String think = "&6(&a0&6.&ao&6?&6)";
			String gimme = "&b\u0F3C\u3064\u25D5_\u25D5\u0F3D\u3064";
			String wizard = "&e(&b'&e-&b'&e)\u2283\u2501&c\u2606\uFF9F&d.*\uFF65\uFF61\uFF9F";
			String pvp = "&e\u2694";
			String pce = "&a\u270C";
			String oof = "&c&lOOF";
			String puffer = "&e<('O')>";
			String yey = "&a\u30FD (\u25D5\u25E1\u25D5) \uFF89";
			String cat = "&e= &b\uFF3E\u25CF \u22CF \u25CF\uFF3E &e=";
			String dab = "&d<&eo&d/";
			String dj = "&9\u30FD&5(&d\u2310&c\u25A0_&e\u25A0&b)&3\u30CE&9\u266C";
			String snow = "&b\u2603";
			String e = "&a^_^";
			String h = "&e\u30FD(^\u25C7^*)/";
			String f = "&a^-^";
			String sloth = "&6(&8\u30FB&6\u229D&8\u30FB&6)";
			String cute = "&a(&e\u273F&a\u25E0\u203F\u25E0)";
			String dog = "&6(\u1D54\u1D25\u1D54)";
			
			
			p.sendMessage(ChatColor.GREEN + "Available to " + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("rankwithemojiacces")) + ChatColor.GREEN + ":" );
			p.sendMessage(ChatColor.GOLD + "<3  - " + ChatColor.translateAlternateColorCodes('&', heart));
			p.sendMessage(ChatColor.GOLD + ":star:  - " + ChatColor.translateAlternateColorCodes('&', star));
			p.sendMessage(ChatColor.GOLD + ":yes:  - " + ChatColor.translateAlternateColorCodes('&', yes));
			p.sendMessage(ChatColor.GOLD + ":no:  - " + ChatColor.translateAlternateColorCodes('&', no));			
			p.sendMessage(ChatColor.GOLD + ":java:  - " + ChatColor.translateAlternateColorCodes('&', java));
			p.sendMessage(ChatColor.GOLD + ":arrow:  - " + ChatColor.translateAlternateColorCodes('&', arrow));
			p.sendMessage(ChatColor.GOLD + ":shrug:  - " + ChatColor.translateAlternateColorCodes('&', shrug));			
			p.sendMessage(ChatColor.GOLD + ":tableflip:  - " + ChatColor.translateAlternateColorCodes('&', tableflip));
			p.sendMessage(ChatColor.GOLD + "o/  - " + ChatColor.translateAlternateColorCodes('&', hi));
			p.sendMessage(ChatColor.GOLD + ":123:  - " + ChatColor.translateAlternateColorCodes('&', onetwothree));
			p.sendMessage(ChatColor.GOLD + ":totem:  - " + ChatColor.translateAlternateColorCodes('&', totem));
			p.sendMessage(ChatColor.GOLD + ":typing:  - " + ChatColor.translateAlternateColorCodes('&', typing));
			p.sendMessage(ChatColor.GOLD + ":maths:  - " + ChatColor.translateAlternateColorCodes('&', maths));
			p.sendMessage(ChatColor.GOLD + ":snail:  - " + ChatColor.translateAlternateColorCodes('&', snail));
			p.sendMessage(ChatColor.GOLD + ":think:  - " + ChatColor.translateAlternateColorCodes('&', think));
			p.sendMessage(ChatColor.GOLD + ":gimme:  - " + ChatColor.translateAlternateColorCodes('&', gimme));
			p.sendMessage(ChatColor.GOLD + ":wizard:  - " + ChatColor.translateAlternateColorCodes('&', wizard));
			p.sendMessage(ChatColor.GOLD + ":pvp:  - " + ChatColor.translateAlternateColorCodes('&', pvp));
			p.sendMessage(ChatColor.GOLD + ":peace:  - " + ChatColor.translateAlternateColorCodes('&', pce));
			p.sendMessage(ChatColor.GOLD + ":oof:  - " + ChatColor.translateAlternateColorCodes('&', oof));
			p.sendMessage(ChatColor.GOLD + ":puffer:  - " + ChatColor.translateAlternateColorCodes('&', puffer));
			p.sendMessage(ChatColor.GOLD + ":yey:  - " + ChatColor.translateAlternateColorCodes('&', yey));
			p.sendMessage(ChatColor.GOLD + ":cat:  - " + ChatColor.translateAlternateColorCodes('&', cat));
			p.sendMessage(ChatColor.GOLD + ":dab:  - " + ChatColor.translateAlternateColorCodes('&', dab));
			p.sendMessage(ChatColor.GOLD + ":dj:  - " + ChatColor.translateAlternateColorCodes('&', dj));
			p.sendMessage(ChatColor.GOLD + ":snow:  - " + ChatColor.translateAlternateColorCodes('&', snow));
			p.sendMessage(ChatColor.GOLD + "^_^  - " + ChatColor.translateAlternateColorCodes('&', e));
			p.sendMessage(ChatColor.GOLD + "h/  - " + ChatColor.translateAlternateColorCodes('&', h));
			p.sendMessage(ChatColor.GOLD + "^-^  - " + ChatColor.translateAlternateColorCodes('&', f));
			p.sendMessage(ChatColor.GOLD + ":sloth:  - " + ChatColor.translateAlternateColorCodes('&', sloth));
			p.sendMessage(ChatColor.GOLD + ":cute:  - " + ChatColor.translateAlternateColorCodes('&', cute));
			p.sendMessage(ChatColor.GOLD + ":dog:  - " + ChatColor.translateAlternateColorCodes('&', dog));
			
	
		}
		
		return true;
	}
	
	@EventHandler
    public void PlayerAsyncChat(final AsyncPlayerChatEvent e) {
        if (e.getPlayer().hasPermission("emotechat.use")) {
            String message = e.getMessage();
            
            String heart = ChatColor.RED + "\u2764";
			String star = ChatColor.GOLD + "\u2605";
			String yes = ChatColor.GREEN + "\u2713";
			String no = ChatColor.RED + "\u2716";
			String java = ChatColor.AQUA + "\u2615";
			String arrow = ChatColor.YELLOW + "\u279C";
			String shrug = ChatColor.YELLOW + "\u00AF\\_(\u30c4)_/\u00AF";
			String tableflip = ChatColor.RED + "(\u256F\u00B0\u25A1\u00B0)\u256F" + ChatColor.WHITE + "\uFE35 \u253B\u2501\u253B";
			String hi = ChatColor.LIGHT_PURPLE + "( \uFF9F\u25E1\uFF9F)/";
			String onetwothree = ChatColor.GREEN + "1" + ChatColor.YELLOW + "2" + ChatColor.RED + "3";
			String totem = ChatColor.AQUA + "\u2609" + ChatColor.YELLOW + "_" + ChatColor.AQUA +"\u2609";
			String typing = ChatColor.YELLOW + "\u270E...";	
			String maths = "&a&l\u221A&e&l(&a&l\u03C0&e&l+&a&lx&e&l)&a&l=&c&lL";
			String snail = "&e@&a'&e-&a'";
			String think = "&6(&a0&6.&ao&6?&6)";
			String gimme = "&b\u0F3C\u3064\u25D5_\u25D5\u0F3D\u3064";
			String wizard = "&e(&b'&e-&b'&e)\u2283\u2501&c\u2606\uFF9F&d.*\uFF65\uFF61\uFF9F";
			String pvp = "&e\u2694";
			String pce = "&a\u270C";
			String oof = "&c&lOOF";
			String puffer = "&e<('O')>";
			String yey = "&a\u30FD (\u25D5\u25E1\u25D5) \uFF89";
			String cat = "&e= &b\uFF3E\u25CF \u22CF \u25CF\uFF3E &e=";
			String dab = "&d<&eo&d/";
			String dj = "&9\u30FD&5(&d\u2310&c\u25A0_&e\u25A0&b)&3\u30CE&9\u266C";
			String snow = "&b\u2603";
			String ez = "&a^_^";
			String h = "&e\u30FD(^\u25C7^*)/";
			String f = "&a^-^";
			String sloth = "&6(&8\u30FB&6\u229D&8\u30FB&6)";
			String cute = "&a(&e\u273F&a\u25E0\u203F\u25E0)";
			String dog = "&6(\u1D54\u1D25\u1D54)";
            
            message = message.replace("<3", heart + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":star:", star + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":yes:", yes + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":no:", no + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":java:", java + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":arrow:", arrow + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":shrug:", shrug + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":tableflip:", tableflip + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace("o/", hi + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":123:", onetwothree + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":totem:", totem + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":typing:", typing + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));

            message = message.replace(":maths:", ChatColor.translateAlternateColorCodes('&', maths)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":snail:", ChatColor.translateAlternateColorCodes('&', snail)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":think:", ChatColor.translateAlternateColorCodes('&', think)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":gimme:", ChatColor.translateAlternateColorCodes('&', gimme)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":wizard:", ChatColor.translateAlternateColorCodes('&', wizard)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":pvp:", ChatColor.translateAlternateColorCodes('&', pvp)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":peace:", ChatColor.translateAlternateColorCodes('&', pce)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":oof:", ChatColor.translateAlternateColorCodes('&', oof)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":puffer:", ChatColor.translateAlternateColorCodes('&', puffer)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
           
            message = message.replace(":yey:", ChatColor.translateAlternateColorCodes('&', yey)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":cat:", ChatColor.translateAlternateColorCodes('&', cat)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":dab:", ChatColor.translateAlternateColorCodes('&', dab)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":dj:", ChatColor.translateAlternateColorCodes('&', dj)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":snow:", ChatColor.translateAlternateColorCodes('&', snow)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":^_^:", ChatColor.translateAlternateColorCodes('&', ez)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace("h/", ChatColor.translateAlternateColorCodes('&', h)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":^-^:", ChatColor.translateAlternateColorCodes('&', f)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":sloth:", ChatColor.translateAlternateColorCodes('&', sloth)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":cute:", ChatColor.translateAlternateColorCodes('&', cute)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));
            message = message.replace(":dog:", ChatColor.translateAlternateColorCodes('&', dog)  + ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("afteremojichatcolor")));

            e.setMessage(message);
        }
	
	
	
	
	}

}
