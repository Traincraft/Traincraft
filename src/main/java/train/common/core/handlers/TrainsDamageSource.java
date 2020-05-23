package train.common.core.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class TrainsDamageSource extends DamageSource {

	public static final List<TrainsDamageSource> damageSources = new ArrayList();

	public static final TrainsDamageSource ranOver = (TrainsDamageSource) new TrainsDamageSource("ranOver", "was rolled over by a train!").setDamageBypassesArmor();
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
	
	@Nonnull
	@Override
	public ITextComponent getDeathMessage(@Nonnull EntityLivingBase entity) {
		if(entity instanceof EntityPlayer){
			return new TextComponentString(String.format("%s%s", ((EntityPlayer) entity).getDisplayNameString(), this.deathMessage));
		} else if(entity instanceof EntityLiving){
			if(entity.hasCustomName()){
				return new TextComponentString(String.format("%s %s", entity.getCustomNameTag(), this.deathMessage));
			}
		}
		return new TextComponentString(String.format("%s %s", entity.getName(), this.deathMessage));
	}
}