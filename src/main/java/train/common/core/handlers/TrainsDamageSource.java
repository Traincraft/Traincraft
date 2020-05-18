package train.common.core.handlers;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;

import java.util.ArrayList;
import java.util.List;

public class TrainsDamageSource extends DamageSource {

	public static final List<TrainsDamageSource> damageSources = new ArrayList();

	public static final TrainsDamageSource ranOver = (TrainsDamageSource) new TrainsDamageSource("ranOver", " was rolled over by a train!").setDamageBypassesArmor();
	public String deathMessage;

	public TrainsDamageSource(String damageType) {
		super(damageType);
		damageSources.add(this);
	}

	public TrainsDamageSource(String damageType, String deathMessage) {
		this(damageType);
		setDeathMessage(deathMessage);
	}

	public TrainsDamageSource setDeathMessage(String deathMessage) {
		this.deathMessage = deathMessage;
		return this;
	}
	@Override
	public DamageSource setDamageAllowedInCreativeMode() {
		return super.setDamageAllowedInCreativeMode();
	}

	/*
	 * public void registerDeathMessage() { LanguageRegistry.instance().addName("death.ranOver", "was rolled over!");//.addStringLocalization("death." + this.damageType, this.deathMessage); } */
	/**
	 * Returns the message to be displayed on player death.
	 */
	@Override
	public ChatComponentText func_151519_b(EntityLivingBase living) {
		if(living instanceof EntityPlayer) {
			return new ChatComponentText(((EntityPlayer) living).getDisplayName() + deathMessage);
		} else if(living instanceof EntityLiving &&((EntityLiving)living).getCustomNameTag() !=null && ((EntityLiving)living).getCustomNameTag().length()>0) {
			return new ChatComponentText( ((EntityLiving)living).getCustomNameTag() + deathMessage);
		} else {
			return new ChatComponentText(living.getCommandSenderName() +deathMessage);
		}
	}
}