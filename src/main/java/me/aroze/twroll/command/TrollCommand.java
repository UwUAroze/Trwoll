package me.aroze.twroll.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.aroze.twroll.util.ChatUtils.color;

public class TrollCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.hasPermission("twroll.troll")) {
            sender.sendMessage(color("&#ff6e6e⚠ You can't do that!"));
            return false;
        }

        if (args.length == 0) {
            sender.sendMessage(color("&#ff6e6e⚠ &#ff7f6e/" + label + "[player], weirdo"));
            return false;
        }

        Player playerToTroll = Bukkit.getPlayer(args[1]);

        if (playerToTroll == null) {
            sender.sendMessage(color("&#ff6e6e⚠ We cannot troll an imaginary player ;c"));
            return false;
        }

        // todo: everything else

        return true;
    }
}
