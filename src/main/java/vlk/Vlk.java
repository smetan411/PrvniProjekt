package vlk;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vlk extends JavaPlugin {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return false;

        Player hrac = (Player) sender;
        World svet = hrac.getWorld();
        Location misto = hrac.getLocation();

        Wolf vlk = svet.spawn(misto, Wolf.class);
        vlk.setCollarColor(DyeColor.BLUE);
        vlk.setTamed(true);
        vlk.setOwner(hrac);
        vlk.setCustomName("mujVlcek");
        vlk.setCustomNameVisible(true);
        return true;
    }

}
