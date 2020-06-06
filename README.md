# Traincraft - A mod for Minecraft

Here you will find the source code for the **Traincraft 1.12.2 rewrite**.  
**Don't ask for release dates or beta builds. Unless you are a developer you should get your builds from [curse](https://minecraft.curseforge.com/projects/traincraft).  
Regarding new features/behavior changes, or if you have found any bugs, please submit a new issue to the issue tracker for it, or add your findings to an existing issue if someone else has already made one.
This helps keep everything organized while saving time and effort.**

## Index
- Join the Discussion!
- Official Links
- What is Traincraft?
- Why did Mrbrutal opensource Traincraft?
- Contributing
- <b>Licensing and rules, READ THIS PART ESPECIALLY</b>

## Join the Discussion!
If you wish to contact the original developers, you can contact Mr. Brutal on twitter [https://twitter.com/Mrbrutall](https://twitter.com/Mrbrutall) or send an email to spitfire4466@gmail.com  
If you'd like to join the live chat, head over to our [Public Discord chat](https://discord.gg/SgpnCnK).  
And, of course, be sure to check out the issues tab here on GitHub.

## Official Links
* Main Site and Downloads: [http://www.traincraft-mod.com](http://www.traincraft-mod.com)
* Brutal's Blog: [http://blog.meansoft.si](http://blog.meansoft.si)
* Our Blog: [https://traincraft-mod.blogspot.com](https://traincraft-mod.blogspot.com)
* Old wiki: [http://wiki.meansoft.si](http://wiki.meansoft.si)
* Brutal's IRC: #Traincraft on Esper.net - Currently not used
* Curse For Downloads: [https://minecraft.curseforge.com/projects/traincraft](https://minecraft.curseforge.com/projects/traincraft)
* 1.7.10 Forum: [http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/2738593-traincraft](http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/2738593-traincraft)
* Discord live chat (active) [https://discord.gg/SgpnCnK](https://discord.gg/SgpnCnK)

## What is Traincraft?
Traincraft is a [Minecraft](https://minecraft.net/) mod built using [Minecraft Forge](https://github.com/MinecraftForge).

Traincraft alters the looks of and adds new functionality to various aspects of the game. It adds over 80 trains, wagons, and other vehicles as well as a new railway system with curved tracks and slopes.  
Traincraft was originally created by **Spitfire4466**, then jointly developed with **Mrbrutal**, and subsequently maintained by **Mrbrutal**. In June 2020 **canitzp** has been declared as an owner too.   
Traincraft has had well over **1,000,000 downloads** and has been in development since Minecraft 1.2.5.

## Why did **Mrbrutal** post the Source Code?
> As of late, **Spitfire4466** and **Mrbrutal** have had little time to work on Traincraft. Open-sourcing the mod was the only viable option that would ensure it's continuation. Message from **Mrbrutal**: I have never open-sourced a project on this level or size, and am a bit hesitant to do so. However, in the hopes that we can make Traincraft great again (no this is not a Trump reference) and that I can still be a part of this, I have open-sourced both versions of Traincraft  here on Github. Anyone that is willing to contribute can contribute as long as they have signed the CLA (scroll down).

## Contributing
The traincraft project welcomes contributions from anyone, provided they have signed the Contributor Licensing Agreement (CLA) found [here](https://cla-assistant.io/Mrbrutal/Traincraft).  

To start developing, fork this branch (e.g.: "git clone https://github.com/Traincraft/Traincraft -b 1.12.2-rewrite") and import the build.gradle file as project into your ide.  
After Forge is done setting everything up, you have to run "genEclipseRuns", "genIntelliJRuns" or "genVCRuns" to generate the correct run files.  
You have to manually add the "TrackAPI" mod to the "mods" directories under "run" and "run_server".
After the firstlaunch and for every resource change, you have to copy "build/resources/main/assets" to "build/classes/java/assets". This is a bug with the current forgegradle version under 1.12.2

## License
All versions for Minecraft 1.7.10 and below are using a custom license which you can find [here](https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md).
All versions for Minecraft 1.12.2 and above are using the [LGPLv3.0 License](https://github.com/IQAndreas/markdown-licenses/blob/master/gnu-lgpl-v3.0.md).
