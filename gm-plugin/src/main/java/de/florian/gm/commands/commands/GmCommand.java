package de.florian.gm.commands.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(player.hasPermission("minecraft.*")) {
                if(args.length == 0) {
                    player.sendMessage("§cBenutzung: /gm [0,1,2,3]!");
                }else if(args.length == 1){
                    if(args[0].equalsIgnoreCase("0")) {
                            player.setGameMode(GameMode.SURVIVAL);
                            player.sendMessage("§eDein Gamemode wurde Erfolgreich zu §aSURVIVAL §egewechselt!");
                    }else if(args[0].equalsIgnoreCase("1")) {
                            player.setGameMode(GameMode.CREATIVE);
                            player.sendMessage("§eDein Gamemode wurde Erfolgreich zu §aCREATIVE §egewechselt!");
                    }else if(args[0].equalsIgnoreCase("2")) {
                            player.setGameMode(GameMode.ADVENTURE);
                            player.sendMessage("§eDein Gamemode wurde Erfolgreich zu §aADVENTURE §egewechselt!");
                    }else if(args[0].equalsIgnoreCase("3")) {
                            player.setGameMode(GameMode.SPECTATOR);
                            player.sendMessage("§eDein Gamemode wurde Erfolgreich zu §aSPECTATOR §egewechselt!");
                    }else {
                        player.sendMessage("§cBenutzung: /gm [0,1,2,3]!");
                    }
                }else {
                    player.sendMessage("§cZu viele Args!");
                }
            }else {
                player.sendMessage("§cDu verfügst nicht über die Nötigen Rechte (minecraft.*)");
            }
        }else {
            sender.sendMessage("Um das zu tun musst du ein Spieler sein!");
        }
        return false;
    }
}
