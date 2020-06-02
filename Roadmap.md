This file describes which features have priority in the upcoming 1.12.2 port/rewrite.

As of right now it is more a rewrite than a port.
A lot of code was removed, commented out or straight away removed, so it even compiles in a 1.12.2 Forge environment.

The following shows a simple path on which features are gonna appear first. Nobody is bound to this, so it may not represent the real progress.

- [x] Compilable for 1.12.2 - latest Minecraft Forge: 
    - For now the tracks and the books (recipe and admin) are removed, also sound and achievements are gonna changed.
- [x] New registry for Items, Blocks and more
- [x] Begin to develop a new API
    - Implement the API with a simple train
    - Model file is loaded from .json (JTMT-Format) on class load (Cooperation with Fexcraft)
- [ ] Implement all the items from 1.7.10
- [ ] Implement all the blocks from 1.7.10
    - Including recipe handling over .json (To support the vanilla based system)
- [ ] Implement driving physics for TrackAPI compatible rails (**Help is needed**)
- [ ] Implement linked rolling stock
    - Already implemented, but not used
- [ ] Implementing GUIs for trains
    - Steam locomotive gui is partly implemented
    - Diesel missing
    - Electric missing
    - Cargo missing (should be done generic, so there aren't a bulk of gui files)
    - Passenger missing (Is it needed?)
- [ ] Implement train logic
    - Steam locomotive logic is partly done
- [ ] Adding more rolling stock from different types, for testing physic and driving
    - 1/2 Steam
    - 0/2 Diesel
    - 0/2 Electric
    - 0/2 Cargo cart
    - 0/2 Passenger cart
- [ ] Adding chunk loading option for trains. Carts should adopt this from their pulling train.
- [ ] First Alpha version can be released

- [ ] Implement Advancements and Sounds
    - The 1.7.10 Achievements should be used as a base
- [ ] Implement new TAPI-Compatible tracks
    - We could use the old track models, but I think more vanilla looking models are nicer
- [ ] Implement the recipe book. We don't need it, but it just looks nice.
- [ ] Second Alpha version release, with most of the bugs found in alpha one fixed.

- [ ] Implement all the rolling stock.
- [ ] Fixing most of the alpha 2 bugs
- [ ] First Beta release