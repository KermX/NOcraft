package nocraft.nocraft.commands;

//PAY NO ATTENTION TO THIS!! very much wip and messing with things

//import nocraft.nocraft.util.ConfigUtil;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;

//public class NOcraftCommands implements CommandExecutor {
//    private ConfigUtil config;
//    @Override
//    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
//        if (args.length == 0){
//            sender.sendMessage("Incorrect Usage!");
//            sender.sendMessage("/NOcraft addhanditem");
//            sender.sendMessage("- adds the item in your hand to config");
//           sender.sendMessage("/NOcraft reload");
//            sender.sendMessage("- reloads plugin configuration");
//        }else if (args.length == 1){
//            String input = args[0];
//            sender.sendMessage("Input:" + input);
//        }else {
//            sender.sendMessage("Incorrect Usage!");
//            sender.sendMessage("/NOcraft addhanditem");
//            sender.sendMessage("- adds the item in your hand to config");
//            sender.sendMessage("/NOcraft reload");
//            sender.sendMessage("- reloads plugin configuration");
//        }








//        if (!(sender instanceof Player)) {
//            sender.sendMessage("This command must be run by a player");
//            return true;
//        }

//        Player player = (Player) sender;
//        String item = String.valueOf(player.getInventory().getItemInMainHand().getType());
//
//        if (player.getInventory().getItemInMainHand().getType() != null) {
//            config.getConfig().set("NOcraft.disabled-crafting-recipes." + item, item);
//        }

//       return true;
//    }
//}
