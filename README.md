# Traincraft - A mod for Minecraft

Here you will find the source code for the **Traincraft 1.7.10 Port**.<br/>
**Don't ask for release dates or beta builds. Unless you are a developer you should get your builds from [curse](https://minecraft.curseforge.com/projects/traincraft). <br/>Regarding new features/behavior changes, or if you have found any bugs, please submit a new issue to the issue tracker for it, or add your findings to an existing issue if someone else has already made one. This helps keep everything organized while saving time and effort.**

## Index
- Join the Discussion!
- Official Links
- What is Traincraft?
- What is this fork?
- Why did Mrbrutal opensource Traincraft?
- Contributing
- <b>Licensing and rules, READ THIS PART ESPECIALLY</b>

## Join the Discussion!
If you wish to contact the original developers, you can contact Mr. Brutal on twitter [https://twitter.com/Mrbrutall](https://twitter.com/Mrbrutall) or send an email to spitfire4466@gmail.com<br/> If you'd like to join the live chat, head over to our [Public Discord chat](https://discord.gg/SgpnCnK).<br/> And, of course, be sure to check out the issues tab here on GitHub.

## Official Links
* Main Site and Downloads: [http://www.traincraft-mod.com](http://www.traincraft-mod.com)
* Brutal's Blog: [http://blog.meansoft.si](http://blog.meansoft.si)
* Our Blog: [https://traincraft-mod.blogspot.com](https://traincraft-mod.blogspot.com)
* Old wiki: [http://wiki.meansoft.si](http://wiki.meansoft.si)
* Brutal's IRC: #Traincraft on Esper.net - Currently not used
* Curse For Downloads: [https://minecraft.curseforge.com/projects/traincraft](https://minecraft.curseforge.com/projects/traincraft)
* 1.7.10 Forum: [http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/2738593-traincraft](http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/2738593-traincraft)
* Discord live chat (active) [https://discord.gg/SgpnCnK](https://discord.gg/SgpnCnK)
* Rewrite and info on upcoming support for 1.8.9+: https://traincraft-mod.blogspot.com/p/tim.html

## What is Traincraft?
Traincraft is a [Minecraft](https://minecraft.net/) mod built using [Minecraft Forge](https://github.com/MinecraftForge).

Traincraft alters the looks of and adds new functionality to various aspects of the game. It adds over 80 trains, wagons, and other vehicles as well as a new railway system with curved tracks and slopes.<br/>Traincraft was originally created by **Spitfire4466**, then jointly developed with **Mrbrutal**, and subsequently maintained by **Mrbrutal**.
Traincraft has had well over **1,000,000 downloads** and has been in development since Minecraft 1.2.5.

## What's this fork?
This specific fork is maintained by **EternalBlueFlame** and **NitroxydeX**. It is intended to be a community made port and cleanup of Traincraft from 1.6.4 to 1.7.10. The overall purpose of this fork is to contribute to the Traincraft project by bringing it to newer Minecraft versions and fixing bugs that have not been adressed.

**Mrbrutal** and **Spitfire4466** still maintain full rights and project lead in this fork.<br/><br/>

## Why did **Mrbrutal** post the Source Code?
> As of late, **Spitfire4466** and **Mrbrutal** have had little time to work on Traincraft. Open-sourcing the mod was the only viable option that would ensure it's continuation. Message from **Mrbrutal**: I have never open-sourced a project on this level or size, and am a bit hesitant to do so. However, in the hopes that we can make Traincraft great again (no this is not a Trump reference) and that I can still be a part of this, I have open-sourced both versions of Traincraft  here on Github. Anyone that is willing to contribute can contribute as long as they have signed the CLA (scroll down).

## Contributing
The traincraft project welcomes contributions from anyone, provided they have signed the Contributor Licensing Agreement (CLA) found [here](https://cla-assistant.io/Mrbrutal/Traincraft).
If you are just looking to make skins, they can all be found here: [https://github.com/EternalBlueFlame/Traincraft-5/tree/1.7/src/main/resources/assets/tc/textures/trains](https://github.com/EternalBlueFlame/Traincraft-5/tree/1.7/src/main/resources/assets/tc/textures/trains)
NOTE: With the rewrite we will continue to support community skins for the models ported from 1.6.4 and older via the "Heritage: Community edition" pack.

For Code changes:
If your IDE asks for a deobfuscator, select the folder:
windows: C:\Users\[USERNAME]\.gradle\caches\minecraft\net\minecraftforge\forge\1.7.10-10.13.4.1558-1.7.10\unpacked\conf
OSX/Linux: ~\.gradle\caches\minecraft\net\minecraftforge\forge\1.7.10-10.13.4.1558-1.7.10\unpacked\conf

Setting up the project was made easy with the setup.bat file (doesn't always work for eclipse, blame forge).<br/>
Otherwise this project will follow standard Forge conventions. See [http://www.minecraftforge.net/wiki/Installation/Source](http://www.minecraftforge.net/wiki/Installation/Source)<br/>
After you finish the tutorial or setup, if it has not already been defined, you must manually define the root path of your JDK installation folder, and the location of your :ForgeBin:<br/>
You may also need to import the required API libraries for the related mods if it is not done automatically (Buildcraft, railcraft, etc).

## License
Traincraft is licensed under a custom usage license tailored specifically for the project. It can be read [here](https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md).
