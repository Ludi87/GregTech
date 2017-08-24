package gregtech.loaders.preload;

import gregtech.api.util.GTLog;
import gregtech.common.items.MetaItem2;
import gregtech.common.items.MetaItem1;
import gregtech.common.items.MetaTool;

public class GT_Loader_Item_Block_And_Fluid
        implements Runnable {
    public void run() {
//        Materials.Water.mFluid = (Materials.Ice.mFluid = GT_ModHandler.getWater(1000L).getFluid());
//        Materials.Lava.mFluid = GT_ModHandler.getLava(1000L).getFluid();

        GTLog.logger.info("GT_Mod: Register Items.");

//        new GT_IntegratedCircuit_Item();
        new MetaItem1();
        new MetaItem2();
        new MetaTool();

//        new GT_Loader_OreDictionary().run();
//        new GT_Loader_ItemData().run();
//        new GT_Loader_OreProcessing().run();

//        ItemList.Rotor_LV.set(OreDictionaryUnifier.get(OrePrefix.rotor, Materials.Tin, 1));
//        ItemList.Rotor_MV.set(OreDictionaryUnifier.get(OrePrefix.rotor, Materials.Bronze, 1));
//        ItemList.Rotor_HV.set(OreDictionaryUnifier.get(OrePrefix.rotor, Materials.Steel, 1));
//        ItemList.Rotor_EV.set(OreDictionaryUnifier.get(OrePrefix.rotor, Materials.StainlessSteel, 1));
//        ItemList.Rotor_IV.set(OreDictionaryUnifier.get(OrePrefix.rotor, Materials.TungstenSteel, 1));
//
//        Item tItem = (Item) GTUtility.callConstructor("gregtech.common.items.GT_SensorCard_Item", 0, null, false, "sensorcard", "GregTech Sensor Card");
//        ItemList.NC_SensorCard.set(tItem == null ? new GenericItem("sensorcard", "GregTech Sensor Card", "Nuclear Control not installed", false) : tItem);
//
//        ItemList.Neutron_Reflector.set(new GT_NeutronReflector_Item("neutronreflector", "Iridium Neutron Reflector", 0));
//        GT_ModHandler.addCraftingRecipe(ItemList.Neutron_Reflector.get(1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RRR", "RPR", "RRR", 'R', GT_ModHandler.getIC2Item(ItemName.thick_neutron_reflector, 1), 'P', OrePrefix.plateAlloy.get(Materials.Iridium)});
//        GT_ModHandler.addCraftingRecipe(ItemList.Neutron_Reflector.get(1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RBR", "RPR", "RBR", 'R', GT_ModHandler.getIC2Item(ItemName.thick_neutron_reflector, 1), 'P', OrePrefix.plateAlloy.get(Materials.Iridium),'B', OrePrefix.plate.get(Materials.TungstenCarbide)});
//
//        ItemList.Reactor_Coolant_He_1.set(GregTechAPI.constructCoolantCellItem("60k_Helium_Coolantcell", "60k He Coolant Cell", 60000));
//        GT_ModHandler.addCraftingRecipe(ItemList.Reactor_Coolant_He_1.get(1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" P ", "PCP", " P ", 'C', OrePrefix.cell.get(Materials.Helium), 'P', OrePrefix.plate.get(Materials.Tin)});
//
//        ItemList.Reactor_Coolant_He_3.set(GregTechAPI.constructCoolantCellItem("180k_Helium_Coolantcell", "180k He Coolant Cell", 180000));
//        GT_ModHandler.addCraftingRecipe(ItemList.Reactor_Coolant_He_3.get(1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PCP", "PCP", "PCP", 'C', ItemList.Reactor_Coolant_He_1, 'P', OrePrefix.plate.get(Materials.Tin)});
//
//        ItemList.Reactor_Coolant_He_6.set(GregTechAPI.constructCoolantCellItem("360k_Helium_Coolantcell", "360k He Coolant Cell", 360000));
//        GT_ModHandler.addCraftingRecipe(ItemList.Reactor_Coolant_He_6.get(1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PCP", "PDP", "PCP", 'C', ItemList.Reactor_Coolant_He_3, 'P', OrePrefix.plate.get(Materials.Tin), 'D', OrePrefix.plateDense.get(Materials.Copper)});
//
//        ItemList.Reactor_Coolant_NaK_1.set(GregTechAPI.constructCoolantCellItem("60k_NaK_Coolantcell", "60k NaK Coolantcell", 60000));
//        GT_ModHandler.addCraftingRecipe(ItemList.Reactor_Coolant_NaK_1.get(1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"TST", "PCP", "TST", 'C', GT_ModHandler.getIC2Item(ItemName.heat_vent, 1), 'T', OrePrefix.plate.get(Materials.Tin), 'S', OrePrefix.dust.get(Materials.Sodium), 'P', OrePrefix.dust.get(Materials.Potassium)});
//
//        ItemList.Reactor_Coolant_NaK_3.set(GregTechAPI.constructCoolantCellItem("180k_NaK_Coolantcell", "180k NaK Coolantcell", 180000));
//        GT_ModHandler.addCraftingRecipe(ItemList.Reactor_Coolant_NaK_3.get(1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PCP", "PCP", "PCP", 'C', ItemList.Reactor_Coolant_NaK_1, 'P', OrePrefix.plate.get(Materials.Tin)});
//
//        ItemList.Reactor_Coolant_NaK_6.set(GregTechAPI.constructCoolantCellItem("360k_NaK_Coolantcell", "360k NaK Coolantcell", 360000));
//        GT_ModHandler.addCraftingRecipe(ItemList.Reactor_Coolant_NaK_6.get(1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"PCP", "PDP", "PCP", 'C', ItemList.Reactor_Coolant_NaK_3, 'P', OrePrefix.plate.get(Materials.Tin), 'D', OrePrefix.plateDense.get(Materials.Copper)});
//
//        if (!GregTechAPI.mIC2Classic) {
//            ItemList.Depleted_Thorium_1.set(new GT_DepletetCell_Item("ThoriumcellDep", "Fuel Rod (Depleted Thorium)", 1));
//            ItemList.Depleted_Thorium_2.set(new GT_DepletetCell_Item("Double_ThoriumcellDep", "Dual Fuel Rod (Depleted Thorium)", 1));
//            ItemList.Depleted_Thorium_4.set(new GT_DepletetCell_Item("Quad_ThoriumcellDep", "Quad Fuel Rod (Depleted Thorium)", 1));
//
//            ItemList.ThoriumCell_1.set(new GT_RadioactiveCellIC_Item("Thoriumcell", "Fuel Rod (Thorium)", 1, 50000, 0.4F, 0, 0.25F, ItemList.Depleted_Thorium_1.get(1), false));
//
//            ItemList.ThoriumCell_2.set(new GT_RadioactiveCellIC_Item("Double_Thoriumcell", "Double Fuel Rod (Thorium)", 2, 50000, 0.4F, 0, 0.25F, ItemList.Depleted_Thorium_2.get(1), false));
//            GT_ModHandler.addCraftingRecipe(ItemList.ThoriumCell_2.get(1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RPR", "   ", "   ", 'R', ItemList.ThoriumCell_1, 'P', OrePrefix.plate.get(Materials.Iron)});
//
//            ItemList.ThoriumCell_4.set(new GT_RadioactiveCellIC_Item("Quad_Thoriumcell", "Quad Fuel Rod (Thorium)", 4, 50000, 0.4F, 0, 0.25F, ItemList.Depleted_Thorium_4.get(1), false));
//            GT_ModHandler.addCraftingRecipe(ItemList.ThoriumCell_4.get(1), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RPR", "CPC", "RPR", 'R', ItemList.ThoriumCell_1, 'P', OrePrefix.plate.get(Materials.Iron), 'C', OrePrefix.plate.get(Materials.Copper)});
//
//            ItemList.Depleted_Naquadah_1.set(new GT_DepletetCell_Item("NaquadahcellDep", "Fuel Rod (Depleted Naquadah)", 1));
//            ItemList.Depleted_Naquadah_2.set(new GT_DepletetCell_Item("Double_NaquadahcellDep", "Dual Fuel Rod (Depleted Naquadah)", 1));
//            ItemList.Depleted_Naquadah_4.set(new GT_DepletetCell_Item("Quad_NaquadahcellDep", "Quad Fuel Rod (Depleted Naquadah)", 1));
//
//            ItemList.NaquadahCell_1.set(new GT_RadioactiveCellIC_Item("Naquadahcell", "Fuel Rod (Naquadah)", 1, 100000, 2F, 1, 1F, ItemList.Depleted_Naquadah_1.get(1, new Object[0]),true));
//
//            ItemList.NaquadahCell_2.set(new GT_RadioactiveCellIC_Item("Double_Naquadahcell", "Double Fuel Rod (Naquadah)", 2, 100000, 2F, 1, 1F, ItemList.Depleted_Naquadah_2.get(1, new Object[0]),true));
//            GT_ModHandler.addCraftingRecipe(ItemList.NaquadahCell_2.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RPR", "   ", "   ", 'R', ItemList.NaquadahCell_1, 'P', OrePrefix.plate.get(Materials.Iron)});
//
//            ItemList.NaquadahCell_4.set(new GT_RadioactiveCellIC_Item("Quad_Naquadahcell", "Quad Fuel Rod (Naquadah)", 4, 100000, 2F, 1, 1F, ItemList.Depleted_Naquadah_4.get(1, new Object[0]),true));
//            GT_ModHandler.addCraftingRecipe(ItemList.NaquadahCell_4.get(1L, new Object[0]), GT_ModHandler.RecipeBits.BUFFERED | GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RPR", "CPC", "RPR", 'R', ItemList.NaquadahCell_1, 'P', OrePrefix.plate.get(Materials.Iron), 'C', OrePrefix.plate.get(Materials.Copper)});
//
//            GT_ModHandler.addThermalCentrifugeRecipe(ItemList.Depleted_Naquadah_1.get(1, new Object[0]), 5000, new Object[]{OreDictionaryUnifier.get(OrePrefix.dust, Materials.Naquadah, 1L), OreDictionaryUnifier.get(OrePrefix.dustSmall, Materials.Naquadria, 2L), OreDictionaryUnifier.get(OrePrefix.dust, Materials.Iron, 1L)});
//            GT_ModHandler.addThermalCentrifugeRecipe(ItemList.Depleted_Naquadah_2.get(1, new Object[0]), 5000, new Object[]{OreDictionaryUnifier.get(OrePrefix.dust, Materials.Naquadah, 2L), OreDictionaryUnifier.get(OrePrefix.dust, Materials.Naquadria, 1L), OreDictionaryUnifier.get(OrePrefix.dust, Materials.Iron, 3L)});
//            GT_ModHandler.addThermalCentrifugeRecipe(ItemList.Depleted_Naquadah_4.get(1, new Object[0]), 5000, new Object[]{OreDictionaryUnifier.get(OrePrefix.dust, Materials.Naquadah, 4L), OreDictionaryUnifier.get(OrePrefix.dust, Materials.Naquadria, 2L), OreDictionaryUnifier.get(OrePrefix.dust, Materials.Iron, 6L)});
//
//            ItemList.Uraniumcell_1.set(new GT_RadioactiveCellIC_Item("reactorUraniumSimple", "Fuel Rod (Uranium)", 1, 20000, 2F, 1, 1F, GT_ModHandler.getIC2Item(ItemName.uranium_fuel_rod, 1), false));
//            ItemList.Uraniumcell_2.set(new GT_RadioactiveCellIC_Item("reactorUraniumDual", "Dual Fuel Rod (Uranium)", 2, 20000, 2F, 1, 1F, GT_ModHandler.getIC2Item(ItemName.dual_uranium_fuel_rod, 1), false));
//            ItemList.Uraniumcell_4.set(new GT_RadioactiveCellIC_Item("reactorUraniumQuad", "Quad Fuel Rod (Uranium)", 4, 20000, 2F, 1, 1F, GT_ModHandler.getIC2Item(ItemName.quad_uranium_fuel_rod, 1), false));
//            ItemList.Moxcell_1.set(new GT_RadioactiveCellIC_Item("reactorMOXSimple", "Fuel Rod (Mox)", 1, 10000, 2F, 1, 1F, GT_ModHandler.getIC2Item(ItemName.mox_fuel_rod, 1), true));
//            ItemList.Moxcell_2.set(new GT_RadioactiveCellIC_Item("reactorMOXDual", "Dual Fuel Rod (Mox)", 2, 10000, 2F, 1, 1F, GT_ModHandler.getIC2Item(ItemName.dual_mox_fuel_rod, 1), true));
//            ItemList.Moxcell_4.set(new GT_RadioactiveCellIC_Item("reactorMOXQuad", "Quad Fuel Rod (Mox)", 4, 10000, 2F, 1, 1F, GT_ModHandler.getIC2Item(ItemName.quad_mox_fuel_rod, 1), true));
//
//            GT_ModHandler.addThermalCentrifugeRecipe(ItemList.Depleted_Thorium_1.get(1), 5000, OreDictionaryUnifier.get(OrePrefix.dustSmall, Materials.Lutetium, 2L), OreDictionaryUnifier.get(OrePrefix.dust, Materials.Thorium, 1), OreDictionaryUnifier.get(OrePrefix.dust, Materials.Iron, 1));
//            GT_ModHandler.addThermalCentrifugeRecipe(ItemList.Depleted_Thorium_2.get(1), 5000, OreDictionaryUnifier.get(OrePrefix.dust, Materials.Lutetium, 1), OreDictionaryUnifier.get(OrePrefix.dust, Materials.Thorium, 2L), OreDictionaryUnifier.get(OrePrefix.dust, Materials.Iron, 3L));
//            GT_ModHandler.addThermalCentrifugeRecipe(ItemList.Depleted_Thorium_4.get(1), 5000, OreDictionaryUnifier.get(OrePrefix.dust, Materials.Lutetium, 2L), OreDictionaryUnifier.get(OrePrefix.dust, Materials.Thorium, 4L), OreDictionaryUnifier.get(OrePrefix.dust, Materials.Iron, 6L));
//        }
//
//        GTLog.logger.info("GT_Mod: Adding Blocks.");
//        GregTechAPI.sBlockMachines = new BlockMachines();
//        GregTechAPI.sBlockCasings1 = new BlockCasings1();
//        GregTechAPI.sBlockCasings2 = new BlockCasings2();
//        GregTechAPI.sBlockCasings3 = new BlockCasings3();
//        GregTechAPI.sBlockCasings4 = new BlockCasings4();
//        GregTechAPI.sBlockCasings5 = new BlockCasings5();
//        GregTechAPI.sBlockGranites = new BlockGranites();
//        GregTechAPI.sBlockConcretes = new BlockConcretes();
//        GregTechAPI.sBlockStones = new BlockStones();
//        GregTechAPI.sBlockReinforced = new BlockReinforced();
//        BlockGeneratedOres.registerOreBlocks();
//
//        GregTechAPI.sBlockMetal1 = BlockStorage.createStorageBlock("blockmetal1", new Materials[]{
//                Materials.Adamantium,
//                Materials.Aluminium,
//                Materials.Americium,
//                Materials.AnnealedCopper,
//                Materials.Antimony,
//                Materials.Arsenic,
//                Materials.AstralSilver,
//                Materials.BatteryAlloy,
//                Materials.Beryllium,
//                Materials.Bismuth,
//                Materials.BismuthBronze,
//                Materials.BlackBronze,
//                Materials.BlackSteel,
//                Materials.BlueAlloy,
//                Materials.BlueSteel,
//                Materials.Brass}, OrePrefix.block);
//
//        GregTechAPI.sBlockMetal2 = BlockStorage.createStorageBlock("blockmetal2", new Materials[]{
//                Materials.Bronze,
//                Materials.Caesium,
//                Materials.Cerium,
//                Materials.Chrome,
//                Materials.ChromiumDioxide,
//                Materials.Cobalt,
//                Materials.CobaltBrass,
//                Materials.Copper,
//                Materials.Cupronickel,
//                Materials.DamascusSteel,
//                Materials.DarkIron,
//                Materials.DeepIron,
//                Materials.Desh,
//                Materials.Duranium,
//                Materials.Dysprosium,
//                Materials.Electrum
//        }, OrePrefix.block);
//
//        GregTechAPI.sBlockMetal3 = BlockStorage.createStorageBlock("blockmetal3", new Materials[]{
//                Materials.ElectrumFlux,
//                Materials.Enderium,
//                Materials.Erbium,
//                Materials.Europium,
//                Materials.FierySteel,
//                Materials.Gadolinium,
//                Materials.Gallium,
//                Materials.Holmium,
//                Materials.HSLA,
//                Materials.Indium,
//                Materials.InfusedGold,
//                Materials.Invar,
//                Materials.Iridium,
//                Materials.IronMagnetic,
//                Materials.IronWood,
//                Materials.Kanthal
//        }, OrePrefix.block);
//
//        GregTechAPI.sBlockMetal4 = BlockStorage.createStorageBlock("blockmetal4", new Materials[]{
//                Materials.Knightmetal,
//                Materials.Lanthanum,
//                Materials.Lead,
//                Materials.Lutetium,
//                Materials.Magnalium,
//                Materials.Magnesium,
//                Materials.Manganese,
//                Materials.MeteoricIron,
//                Materials.MeteoricSteel,
//                Materials.Midasium,
//                Materials.Mithril,
//                Materials.Molybdenum,
//                Materials.Naquadah,
//                Materials.NaquadahAlloy,
//                Materials.NaquadahEnriched,
//                Materials.Naquadria
//        }, OrePrefix.block);
//
//        GregTechAPI.sBlockMetal5 = BlockStorage.createStorageBlock("blockmetal5", new Materials[]{
//                Materials.Neodymium,
//                Materials.NeodymiumMagnetic,
//                Materials.Neutronium,
//                Materials.Nichrome,
//                Materials.Nickel,
//                Materials.Niobium,
//                Materials.NiobiumNitride,
//                Materials.NiobiumTitanium,
//                Materials.Osmiridium,
//                Materials.Osmium,
//                Materials.Palladium,
//                Materials.PigIron,
//                Materials.Platinum,
//                Materials.Plutonium,
//                Materials.Plutonium241,
//                Materials.Praseodymium
//        }, OrePrefix.block);
//
//        GregTechAPI.sBlockMetal6 = BlockStorage.createStorageBlock("blockmetal6", new Materials[]{
//                Materials.Promethium,
//                Materials.RedAlloy,
//                Materials.RedSteel,
//                Materials.RoseGold,
//                Materials.Rubidium,
//                Materials.Samarium,
//                Materials.Scandium,
//                Materials.ShadowIron,
//                Materials.ShadowSteel,
//                Materials.Silicon,
//                Materials.Silver,
//                Materials.SolderingAlloy,
//                Materials.StainlessSteel,
//                Materials.Steel,
//                Materials.SteelMagnetic,
//                Materials.SterlingSilver
//        }, OrePrefix.block);
//
//        GregTechAPI.sBlockMetal7 = BlockStorage.createStorageBlock("blockmetal7", new Materials[]{
//                Materials.Sunnarium,
//                Materials.Tantalum,
//                Materials.Tellurium,
//                Materials.Terbium,
//                Materials.Thaumium,
//                Materials.Thorium,
//                Materials.Thulium,
//                Materials.Tin,
//                Materials.TinAlloy,
//                Materials.Titanium,
//                Materials.Tritanium,
//                Materials.Tungsten,
//                Materials.TungstenSteel,
//                Materials.Ultimet,
//                Materials.Uranium,
//                Materials.Uranium235
//        }, OrePrefix.block);
//
//        GregTechAPI.sBlockMetal8 = BlockStorage.createStorageBlock("blockmetal8", new Materials[]{
//                Materials.Vanadium,
//                Materials.VanadiumGallium,
//                Materials.WroughtIron,
//                Materials.Ytterbium,
//                Materials.Yttrium,
//                Materials.YttriumBariumCuprate,
//                Materials.Zinc,
//                Materials.TungstenCarbide,
//                Materials.VanadiumSteel,
//                Materials.HSSG,
//                Materials.HSSE,
//                Materials.HSSS
//        }, OrePrefix.block);
//
//        GregTechAPI.sBlockGem1 = BlockStorage.createStorageBlock("blockgem1", new Materials[]{
//                Materials.InfusedAir,
//                Materials.Amber,
//                Materials.Amethyst,
//                Materials.InfusedWater,
//                Materials.BlueTopaz,
//                Materials.CertusQuartz,
//                Materials.Dilithium,
//                Materials.EnderEye,
//                Materials.EnderPearl,
//                Materials.FoolsRuby,
//                Materials.Force,
//                Materials.Forcicium,
//                Materials.Forcillium,
//                Materials.GreenSapphire,
//                Materials.InfusedFire,
//                Materials.Jasper
//        }, OrePrefix.block);
//
//        GregTechAPI.sBlockGem2 = BlockStorage.createStorageBlock("blockgem2", new Materials[]{
//                Materials.Lazurite,
//                Materials.Lignite,
//                Materials.Monazite,
//                Materials.Niter,
//                Materials.Olivine,
//                Materials.Opal,
//                Materials.InfusedOrder,
//                Materials.InfusedEntropy,
//                Materials.Phosphor,
//                Materials.Quartzite,
//                Materials.GarnetRed,
//                Materials.Ruby,
//                Materials.Sapphire,
//                Materials.Sodalite,
//                Materials.Tanzanite,
//                Materials.InfusedEarth
//        }, OrePrefix.block);
//
//        GregTechAPI.sBlockGem3 = BlockStorage.createStorageBlock("blockgem3", new Materials[]{
//                Materials.Topaz,
//                Materials.Vinteum,
//                Materials.GarnetYellow,
//                Materials.NetherStar,
//                Materials.Charcoal
//        }, OrePrefix.block);
//
//        GTLog.logger.info("GT_Mod: Register TileEntities.");
//
//
//        BaseMetaTileEntity tBaseMetaTileEntity = GregTechAPI.constructBaseMetaTileEntity();
//
//        GTLog.logger.info("GT_Mod: Testing BaseMetaTileEntity.");
//        if (tBaseMetaTileEntity == null) {
//            GTLog.logger.info("GT_Mod: Fatal Error ocurred while initializing TileEntities, crashing Minecraft.");
//            throw new RuntimeException("");
//        }
//        GTLog.logger.info("GT_Mod: Registering the BaseMetaTileEntity.");
//        GameRegistry.registerTileEntity(tBaseMetaTileEntity.getClass(), "BaseMetaTileEntity");
//        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", tBaseMetaTileEntity.getClass().getName());
//
//        GTLog.logger.info("GT_Mod: Registering the BaseMetaPipeEntity.");
//        GameRegistry.registerTileEntity(BaseMetaPipeEntity.class, "BaseMetaPipeEntity");
//        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", BaseMetaPipeEntity.class.getName());
//
//        GTLog.logger.info("GT_Mod: Registering the Ore TileEntity.");
//
//        if (!GregTechAPI.mIC2Classic) {
//            GTLog.logger.info("GT_Mod: Registering Fluids.");
//            Materials.ConstructionFoam.mFluid = FluidName.construction_foam.getInstance();
//            Materials.UUMatter.mFluid = FluidName.uu_matter.getInstance();
//        }
//
//
//        //manually register fluid containers for vanilla liquids
//        GT_Mod.gregtechproxy.registerFluidContainer(ItemList.Cell_Water.get(1), ItemList.Cell_Empty.get(1), FluidRegistry.WATER, 1000);
//        GT_Mod.gregtechproxy.registerFluidContainer(ItemList.Cell_Lava.get(1), ItemList.Cell_Empty.get(1), FluidRegistry.LAVA, 1000);
//
//        GT_Mod.gregtechproxy.addFluid("Air", "Air", Materials.Air, 2, 295, ItemList.Cell_Air.get(1), ItemList.Cell_Empty.get(1), 2000);
//        GT_Mod.gregtechproxy.addFluid("Oxygen", "Oxygen", Materials.Oxygen, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Oxygen, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Hydrogen", "Hydrogen", Materials.Hydrogen, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Hydrogen, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Deuterium", "Deuterium", Materials.Deuterium, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Deuterium, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Tritium", "Tritium", Materials.Tritium, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Tritium, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Helium", "Helium", Materials.Helium, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Helium, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Argon", "Argon", Materials.Argon, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Argon, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Radon", "Radon", Materials.Radon, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Radon, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Fluorine", "Fluorine", Materials.Fluorine, 2, 53, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Fluorine, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Titaniumtetrachloride", "Titaniumtetrachloride", Materials.Titaniumtetrachloride, 1, 2200, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Titaniumtetrachloride, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Helium-3", "Helium-3", Materials.Helium_3, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Helium_3, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Methane", "Methane", Materials.Methane, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Methane, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Nitrogen", "Nitrogen", Materials.Nitrogen, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Nitrogen, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("NitrogenDioxide", "Nitrogen Dioxide", Materials.NitrogenDioxide, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.NitrogenDioxide, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Steam", "Steam", Materials.Water, 2, 375);
//        Materials.Ice.mGas = Materials.Water.mGas;
//        Materials.Water.mGas.setTemperature(375).setGaseous(true);
//
//        ItemList.sOilExtraHeavy = GT_Mod.gregtechproxy.addFluid("liquid_extra_heavy_oil", "Very Heavy Oil", null, 1, 295);
//        ItemList.sEpichlorhydrin = GT_Mod.gregtechproxy.addFluid("liquid_epichlorhydrin", "Epichlorohydrin", null, 1, 295);
//        ItemList.sDrillingFluid = GT_Mod.gregtechproxy.addFluid("liquid_drillingfluid", "Drilling Fluid", null, 1, 295);
//        ItemList.sToluene = GT_Mod.gregtechproxy.addFluid("liquid_toluene", "Toluene", null, 1, 295);
//        ItemList.sNitrationMixture = GT_Mod.gregtechproxy.addFluid("liquid_nitrationmixture", "Nitration Mixture", null, 1, 295);
//
//        GT_Mod.gregtechproxy.addFluid("liquid_heavy_oil", "Heavy Oil", Materials.OilHeavy, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.OilHeavy, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("liquid_medium_oil", "Raw Oil", Materials.OilMedium, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.OilMedium, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("liquid_light_oil", "Light Oil", Materials.OilLight, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.OilLight, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("gas_natural_gas", "Natural Gas", Materials.NatruralGas, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.NatruralGas, 1), ItemList.Cell_Empty.get(1), 1000);
//        ItemList.sHydricSulfur = GT_Mod.gregtechproxy.addFluid("liquid_hydricsulfur", "Hydric Sulfide", Materials.HydricSulfide, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.HydricSulfide, 1L), ItemList.Cell_Empty.get(1L, new Object[0]), 1000);
//        GT_Mod.gregtechproxy.addFluid("gas_sulfuricgas", "Sulfuric Gas", Materials.SulfuricGas, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.SulfuricGas, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("gas_gas", "Refinery Gas", Materials.Gas, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Gas, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("liquid_sulfuricnaphtha", "Sulfuric Naphtha", Materials.SulfuricNaphtha, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.SulfuricNaphtha, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("liquid_sufluriclight_fuel", "Sulfuric Light Fuel", Materials.SulfuricLightFuel, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.SulfuricLightFuel, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("liquid_sulfuricheavy_fuel", "Sulfuric Heavy Fuel", Materials.SulfuricHeavyFuel, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.SulfuricHeavyFuel, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("liquid_naphtha", "Naphtha", Materials.Naphtha, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Naphtha, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("liquid_light_fuel", "Light Fuel", Materials.LightFuel, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.LightFuel, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("liquid_heavy_fuel", "Heavy Fuel", Materials.HeavyFuel, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.HeavyFuel, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("liquid_lpg", "LPG", Materials.LPG, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.LPG, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("liquid_cracked_light_fuel", "Cracked Light Fuel", Materials.CrackedLightFuel, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.CrackedLightFuel, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("liquid_cracked_heavy_fuel", "Cracked Heavy Fuel", Materials.CrackedHeavyFuel, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.CrackedHeavyFuel, 1), ItemList.Cell_Empty.get(1), 1000);
//
//        GT_Mod.gregtechproxy.addFluid("UUAmplifier", "UU Amplifier", Materials.UUAmplifier, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.UUAmplifier, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Chlorine", "Chlorine", Materials.Chlorine, 2, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Chlorine, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Mercury", "Mercury", Materials.Mercury, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Mercury, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("NitroFuel", "Nitro Diesel", Materials.NitroFuel, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.NitroFuel, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("SodiumPersulfate", "Sodium Persulfate", Materials.SodiumPersulfate, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.SodiumPersulfate, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("Glyceryl", "Glyceryl Trinitrate", Materials.Glyceryl, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Glyceryl, 1), ItemList.Cell_Empty.get(1), 1000);
//
//        GT_Mod.gregtechproxy.addFluid("lubricant", "Lubricant", Materials.Lubricant, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Lubricant, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("creosote", "Creosote Oil", Materials.Creosote, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Creosote, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("seedoil", "Seed Oil", Materials.SeedOil, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.SeedOil, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("fishoil", "Fish Oil", Materials.FishOil, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.FishOil, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("oil", "Oil", Materials.Oil, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Oil, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("fuel", "Diesel", Materials.Fuel, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Fuel, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("for.honey", "Honey", Materials.Honey, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Honey, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("biomass", "Biomass", Materials.Biomass, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Biomass, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("bioethanol", "Bio Ethanol", Materials.Ethanol, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Ethanol, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("sulfuricacid", "Sulfuric Acid", Materials.SulfuricAcid, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.SulfuricAcid, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("milk", "Milk", Materials.Milk, 1, 290, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Milk, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("mcguffium", "Mc Guffium 239", Materials.McGuffium239, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.McGuffium239, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("glue", "Glue", Materials.Glue, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Glue, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("hotfryingoil", "Hot Frying Oil", Materials.FryingOilHot, 1, 400, OreDictionaryUnifier.get(OrePrefix.cell, Materials.FryingOilHot, 1), ItemList.Cell_Empty.get(1), 1000);
//
//        GT_Mod.gregtechproxy.addFluid("fieryblood", "Fiery Blood", Materials.FierySteel, 1, 6400, OreDictionaryUnifier.get(OrePrefix.cell, Materials.FierySteel, 1), ItemList.Cell_Empty.get(1), 1000);
//        GT_Mod.gregtechproxy.addFluid("holywater", "Holy Water", Materials.HolyWater, 1, 295, OreDictionaryUnifier.get(OrePrefix.cell, Materials.HolyWater, 1), ItemList.Cell_Empty.get(1), 1000);
//        if (ItemList.TF_Vial_FieryBlood.get(1) != null) {
//            FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(Materials.FierySteel.getFluid(250L), ItemList.TF_Vial_FieryBlood.get(1), ItemList.Bottle_Empty.get(1)));
//        }
//
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(Materials.Milk.getFluid(1000L), OreDictionaryUnifier.get(OrePrefix.bucket, Materials.Milk, 1), OreDictionaryUnifier.get(OrePrefix.bucket, Materials.Empty, 1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(Materials.Milk.getFluid(250L), ItemList.Bottle_Milk.get(1), ItemList.Bottle_Empty.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(Materials.HolyWater.getFluid(250L), ItemList.Bottle_Holy_Water.get(1), ItemList.Bottle_Empty.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(Materials.McGuffium239.getFluid(250L), ItemList.McGuffium_239.get(1), ItemList.Bottle_Empty.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(Materials.Fuel.getFluid(100L), ItemList.Tool_Lighter_Invar_Full.get(1), ItemList.Tool_Lighter_Invar_Empty.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(Materials.Fuel.getFluid(1000L), ItemList.Tool_Lighter_Platinum_Full.get(1), ItemList.Tool_Lighter_Platinum_Empty.get(1)));
//
//        Dyes.dyeBlack.addFluidDye(GT_Mod.gregtechproxy.addFluid("squidink", "Squid Ink", null, 1, 295));
//        Dyes.dyeBlue.addFluidDye(GT_Mod.gregtechproxy.addFluid("indigo", "Indigo Dye", null, 1, 295));
//        for (byte i = 0; i < Dyes.VALUES.length; i = (byte) (i + 1)) {
//            Dyes tDye = Dyes.VALUES[i];
//            Fluid tFluid;
//            tDye.addFluidDye(tFluid = GT_Mod.gregtechproxy.addFluid("dye.watermixed." + tDye.name().toLowerCase(Locale.ENGLISH), "dyes", "Water Mixed " + tDye.mName + " Dye", null, tDye.getRGBA(), 1, 295, null, null, 0));
//            tDye.addFluidDye(tFluid = GT_Mod.gregtechproxy.addFluid("dye.chemical." + tDye.name().toLowerCase(Locale.ENGLISH), "dyes", "Chemical " + tDye.mName + " Dye", null, tDye.getRGBA(), 1, 295, null, null, 0));
//            FluidContainerRegistry.registerFluidContainer(new FluidStack(tFluid, 2304), ItemList.SPRAY_CAN_DYES[i].get(1), ItemList.Spray_Empty.get(1));
//        }
//        GT_Mod.gregtechproxy.addFluid("ice", "Crushed Ice", Materials.Ice, 0, 270, OreDictionaryUnifier.get(OrePrefix.cell, Materials.Ice, 1), ItemList.Cell_Empty.get(1), 1000);
//        Materials.Water.mSolid = Materials.Ice.mSolid;
//
//
//        GT_Mod.gregtechproxy.addFluid("molten.glass", "Molten Glass", Materials.Glass, 4, 1500);
//        GT_Mod.gregtechproxy.addFluid("molten.redstone", "Molten Redstone", Materials.Redstone, 4, 500);
//        GT_Mod.gregtechproxy.addFluid("molten.blaze", "Molten Blaze", Materials.Blaze, 4, 6400);
//        GT_Mod.gregtechproxy.addFluid("molten.concrete", "Wet Concrete", Materials.Concrete, 4, 300);
//        for (Materials tMaterial : Materials.values()) {
//            if ((tMaterial.mStandardMoltenFluid == null) && (tMaterial.contains(SubTag.SMELTING_TO_FLUID)) && (!tMaterial.contains(SubTag.NO_SMELTING))) {
//                GT_Mod.gregtechproxy.addAutogeneratedMoltenFluid(tMaterial);
//                if ((tMaterial.mSmeltInto != tMaterial) && (tMaterial.mSmeltInto.mStandardMoltenFluid == null)) {
//                    GT_Mod.gregtechproxy.addAutogeneratedMoltenFluid(tMaterial.mSmeltInto);
//                }
//            }
//            if (tMaterial.mElement != null) {
//                GT_Mod.gregtechproxy.addAutogeneratedPlasmaFluid(tMaterial);
//            }
//        }
//        GT_Mod.gregtechproxy.addFluid("potion.awkward", "Awkward Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.thick", "Thick Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 32), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.mundane", "Mundane Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 64), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.damage", "Harming Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8204), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.damage.strong", "Strong Harming Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8236), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.damage.splash", "Splash Harming Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16396), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.damage.strong.splash", "Strong Splash Harming Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16428), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.health", "Healing Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8197), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.health.strong", "Strong Healing Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8229), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.health.splash", "Splash Healing Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16389), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.health.strong.splash", "Strong Splash Healing Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16421), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.speed", "Swiftness Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8194), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.speed.strong", "Strong Swiftness Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8226), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.speed.long", "Stretched Swiftness Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8258), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.speed.splash", "Splash Swiftness Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16386), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.speed.strong.splash", "Strong Splash Swiftness Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16418), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.speed.long.splash", "Stretched Splash Swiftness Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16450), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.strength", "Strength Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8201), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.strength.strong", "Strong Strength Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8233), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.strength.long", "Stretched Strength Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8265), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.strength.splash", "Splash Strength Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16393), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.strength.strong.splash", "Strong Splash Strength Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16425), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.strength.long.splash", "Stretched Splash Strength Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16457), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.regen", "Regenerating Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8193), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.regen.strong", "Strong Regenerating Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8225), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.regen.long", "Stretched Regenerating Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8257), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.regen.splash", "Splash Regenerating Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16385), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.regen.strong.splash", "Strong Splash Regenerating Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16417), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.regen.long.splash", "Stretched Splash Regenerating Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16449), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.poison", "Poisonous Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8196), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.poison.strong", "Strong Poisonous Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8228), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.poison.long", "Stretched Poisonous Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8260), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.poison.splash", "Splash Poisonous Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16388), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.poison.strong.splash", "Strong Splash Poisonous Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16420), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.poison.long.splash", "Stretched Splash Poisonous Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16452), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.fireresistance", "Fire Resistant Brew", null, 1, 375, new ItemStack(Items.POTIONITEM, 1, 8195), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.fireresistance.long", "Stretched Fire Resistant Brew", null, 1, 375, new ItemStack(Items.POTIONITEM, 1, 8259), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.fireresistance.splash", "Splash Fire Resistant Brew", null, 1, 375, new ItemStack(Items.POTIONITEM, 1, 16387), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.fireresistance.long.splash", "Stretched Splash Fire Resistant Brew", null, 1, 375, new ItemStack(Items.POTIONITEM, 1, 16451), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.nightvision", "Night Vision Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8198), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.nightvision.long", "Stretched Night Vision Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8262), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.nightvision.splash", "Splash Night Vision Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16390), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.nightvision.long.splash", "Stretched Splash Night Vision Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16454), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.weakness", "Weakening Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8200), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.weakness.long", "Stretched Weakening Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8264), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.weakness.splash", "Splash Weakening Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16392), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.weakness.long.splash", "Stretched Splash Weakening Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16456), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.slowness", "Lame Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8202), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.slowness.long", "Stretched Lame Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8266), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.slowness.splash", "Splash Lame Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16394), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.slowness.long.splash", "Stretched Splash Lame Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16458), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.waterbreathing", "Fishy Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8205), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.waterbreathing.long", "Stretched Fishy Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8269), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.waterbreathing.splash", "Splash Fishy Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16397), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.waterbreathing.long.splash", "Stretched Splash Fishy Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16461), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.invisibility", "Invisible Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8206), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.invisibility.long", "Stretched Invisible Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 8270), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.invisibility.splash", "Splash Invisible Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16398), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.invisibility.long.splash", "Stretched Splash Invisible Brew", null, 1, 295, new ItemStack(Items.POTIONITEM, 1, 16462), ItemList.Bottle_Empty.get(1), 250);
//
//        GT_Mod.gregtechproxy.addFluid("potion.purpledrink", "Purple Drink", null, 1, 275, ItemList.Bottle_Purple_Drink.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.grapejuice", "Grape Juice", null, 1, 295, ItemList.Bottle_Grape_Juice.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.wine", "Wine", null, 1, 295, ItemList.Bottle_Wine.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.vinegar", "Vinegar", null, 1, 295, ItemList.Bottle_Vinegar.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.potatojuice", "Potato Juice", null, 1, 295, ItemList.Bottle_Potato_Juice.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.vodka", "Vodka", null, 1, 275, ItemList.Bottle_Vodka.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.leninade", "Leninade", null, 1, 275, ItemList.Bottle_Leninade.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.mineralwater", "Mineral Water", null, 1, 275, ItemList.Bottle_Mineral_Water.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.saltywater", "Salty Water", null, 1, 275, ItemList.Bottle_Salty_Water.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.reedwater", "Reed Water", null, 1, 295, ItemList.Bottle_Reed_Water.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.rum", "Rum", null, 1, 295, ItemList.Bottle_Rum.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.piratebrew", "Pirate Brew", null, 1, 295, ItemList.Bottle_Pirate_Brew.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.hopsjuice", "Hops Juice", null, 1, 295, ItemList.Bottle_Hops_Juice.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.darkbeer", "Dark Beer", null, 1, 275, ItemList.Bottle_Dark_Beer.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.dragonblood", "Dragon Blood", null, 1, 375, ItemList.Bottle_Dragon_Blood.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.wheatyjuice", "Wheaty Juice", null, 1, 295, ItemList.Bottle_Wheaty_Juice.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.scotch", "Scotch", null, 1, 275, ItemList.Bottle_Scotch.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.glenmckenner", "Glen McKenner", null, 1, 275, ItemList.Bottle_Glen_McKenner.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.wheatyhopsjuice", "Wheaty Hops Juice", null, 1, 295, ItemList.Bottle_Wheaty_Hops_Juice.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.beer", "Beer", null, 1, 275, ItemList.Bottle_Beer.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.chillysauce", "Chilly Sauce", null, 1, 375, ItemList.Bottle_Chilly_Sauce.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.hotsauce", "Hot Sauce", null, 1, 380, ItemList.Bottle_Hot_Sauce.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.diabolosauce", "Diabolo Sauce", null, 1, 385, ItemList.Bottle_Diabolo_Sauce.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.diablosauce", "Diablo Sauce", null, 1, 390, ItemList.Bottle_Diablo_Sauce.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.diablosauce.strong", "Old Man Snitches glitched Diablo Sauce", null, 1, 999, ItemList.Bottle_Snitches_Glitch_Sauce.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.applejuice", "Apple Juice", null, 1, 295, ItemList.Bottle_Apple_Juice.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.cider", "Cider", null, 1, 295, ItemList.Bottle_Cider.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.goldenapplejuice", "Golden Apple Juice", null, 1, 295, ItemList.Bottle_Golden_Apple_Juice.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.goldencider", "Golden Cider", null, 1, 295, ItemList.Bottle_Golden_Cider.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.idunsapplejuice", "Idun's Apple Juice", null, 1, 295, ItemList.Bottle_Iduns_Apple_Juice.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.notchesbrew", "Notches Brew", null, 1, 295, ItemList.Bottle_Notches_Brew.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.lemonjuice", "Lemon Juice", null, 1, 295, ItemList.Bottle_Lemon_Juice.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.limoncello", "Limoncello", null, 1, 295, ItemList.Bottle_Limoncello.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.lemonade", "Lemonade", null, 1, 275, ItemList.Bottle_Lemonade.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.alcopops", "Alcopops", null, 1, 275, ItemList.Bottle_Alcopops.get(1), ItemList.Bottle_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.cavejohnsonsgrenadejuice", "Cave Johnsons Grenade Juice", null, 1, 295, ItemList.Bottle_Cave_Johnsons_Grenade_Juice.get(1), ItemList.Bottle_Empty.get(1), 250);
//
//        GT_Mod.gregtechproxy.addFluid("potion.darkcoffee", "Dark Coffee", null, 1, 295, ItemList.ThermosCan_Dark_Coffee.get(1), ItemList.ThermosCan_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.darkcafeaulait", "Dark Cafe au lait", null, 1, 295, ItemList.ThermosCan_Dark_Cafe_au_lait.get(1), ItemList.ThermosCan_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.coffee", "Coffee", null, 1, 295, ItemList.ThermosCan_Coffee.get(1), ItemList.ThermosCan_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.cafeaulait", "Cafe au lait", null, 1, 295, ItemList.ThermosCan_Cafe_au_lait.get(1), ItemList.ThermosCan_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.laitaucafe", "Lait au cafe", null, 1, 295, ItemList.ThermosCan_Lait_au_cafe.get(1), ItemList.ThermosCan_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.darkchocolatemilk", "Bitter Chocolate Milk", null, 1, 295, ItemList.ThermosCan_Dark_Chocolate_Milk.get(1), ItemList.ThermosCan_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.chocolatemilk", "Chocolate Milk", null, 1, 295, ItemList.ThermosCan_Chocolate_Milk.get(1), ItemList.ThermosCan_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.tea", "Tea", null, 1, 295, ItemList.ThermosCan_Tea.get(1), ItemList.ThermosCan_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.sweettea", "Sweet Tea", null, 1, 295, ItemList.ThermosCan_Sweet_Tea.get(1), ItemList.ThermosCan_Empty.get(1), 250);
//        GT_Mod.gregtechproxy.addFluid("potion.icetea", "Ice Tea", null, 1, 255, ItemList.ThermosCan_Ice_Tea.get(1), ItemList.ThermosCan_Empty.get(1), 250);
//
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.poison.strong", 750), ItemList.IC2_Spray_WeedEx.get(1), ItemList.Spray_Empty.get(1)));
//
//
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.poison", 125), ItemList.Arrow_Head_Glass_Poison.get(1), ItemList.Arrow_Head_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.poison.long", 125), ItemList.Arrow_Head_Glass_Poison_Long.get(1), ItemList.Arrow_Head_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.poison.strong", 125), ItemList.Arrow_Head_Glass_Poison_Strong.get(1), ItemList.Arrow_Head_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.slowness", 125), ItemList.Arrow_Head_Glass_Slowness.get(1), ItemList.Arrow_Head_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.slowness.long", 125), ItemList.Arrow_Head_Glass_Slowness_Long.get(1), ItemList.Arrow_Head_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.weakness", 125), ItemList.Arrow_Head_Glass_Weakness.get(1), ItemList.Arrow_Head_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.weakness.long", 125), ItemList.Arrow_Head_Glass_Weakness_Long.get(1), ItemList.Arrow_Head_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("holywater", 125), ItemList.Arrow_Head_Glass_Holy_Water.get(1), ItemList.Arrow_Head_Glass_Emtpy.get(1)));
//
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.poison", 125), ItemList.Arrow_Wooden_Glass_Poison.get(1), ItemList.Arrow_Wooden_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.poison.long", 125), ItemList.Arrow_Wooden_Glass_Poison_Long.get(1), ItemList.Arrow_Wooden_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.poison.strong", 125), ItemList.Arrow_Wooden_Glass_Poison_Strong.get(1), ItemList.Arrow_Wooden_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.slowness", 125), ItemList.Arrow_Wooden_Glass_Slowness.get(1), ItemList.Arrow_Wooden_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.slowness.long", 125), ItemList.Arrow_Wooden_Glass_Slowness_Long.get(1), ItemList.Arrow_Wooden_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.weakness", 125), ItemList.Arrow_Wooden_Glass_Weakness.get(1), ItemList.Arrow_Wooden_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.weakness.long", 125), ItemList.Arrow_Wooden_Glass_Weakness_Long.get(1), ItemList.Arrow_Wooden_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("holywater", 125), ItemList.Arrow_Wooden_Glass_Holy_Water.get(1), ItemList.Arrow_Wooden_Glass_Emtpy.get(1)));
//
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.poison", 125), ItemList.Arrow_Plastic_Glass_Poison.get(1), ItemList.Arrow_Plastic_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.poison.long", 125), ItemList.Arrow_Plastic_Glass_Poison_Long.get(1), ItemList.Arrow_Plastic_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.poison.strong", 125), ItemList.Arrow_Plastic_Glass_Poison_Strong.get(1), ItemList.Arrow_Plastic_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.slowness", 125), ItemList.Arrow_Plastic_Glass_Slowness.get(1), ItemList.Arrow_Plastic_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.slowness.long", 125), ItemList.Arrow_Plastic_Glass_Slowness_Long.get(1), ItemList.Arrow_Plastic_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.weakness", 125), ItemList.Arrow_Plastic_Glass_Weakness.get(1), ItemList.Arrow_Plastic_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("potion.weakness.long", 125), ItemList.Arrow_Plastic_Glass_Weakness_Long.get(1), ItemList.Arrow_Plastic_Glass_Emtpy.get(1)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(FluidRegistry.getFluidStack("holywater", 125), ItemList.Arrow_Plastic_Glass_Holy_Water.get(1), ItemList.Arrow_Plastic_Glass_Emtpy.get(1)));
//
//        GT_ModHandler.addPulverisationRecipe(new ItemStack(Blocks.COBBLESTONE, 1, 32767), new ItemStack(Blocks.SAND, 1), null, 0, false);
//        //GT_ModHandler.addPulverisationRecipe(new ItemStack(Blocks.stone, 1, 32767), new ItemStack(Blocks.cobblestone, 1), null, 0, false);
//        GT_ModHandler.addPulverisationRecipe(new ItemStack(Blocks.GRAVEL, 1, 32767), new ItemStack(Items.FLINT, 1), OreDictionaryUnifier.get(OrePrefix.dustSmall, Materials.Flint, 1), 10, false);
//        GT_ModHandler.addPulverisationRecipe(new ItemStack(Blocks.FURNACE, 1, 32767), new ItemStack(Blocks.SAND, 6), null, 0, false);
//
//        OreDictionaryUnifier.set(OrePrefix.ingot, Materials.FierySteel, GT_ModHandler.getModItem("TwilightForest", "item.fieryIngot", 1, 0));
//        OreDictionaryUnifier.set(OrePrefix.ingot, Materials.Knightmetal, GT_ModHandler.getModItem("TwilightForest", "item.knightMetal", 1, 0));
//        OreDictionaryUnifier.set(OrePrefix.ingot, Materials.Steeleaf, GT_ModHandler.getModItem("TwilightForest", "item.steeleafIngot", 1, 0));
//        OreDictionaryUnifier.set(OrePrefix.ingot, Materials.IronWood, GT_ModHandler.getModItem("TwilightForest", "item.ironwoodIngot", 1, 0));
//        OreDictionaryUnifier.set(OrePrefix.gem, Materials.InfusedAir, GT_ModHandler.getModItem("Thaumcraft", "ItemShard", 1, 0));
//        OreDictionaryUnifier.set(OrePrefix.gem, Materials.InfusedFire, GT_ModHandler.getModItem("Thaumcraft", "ItemShard", 1, 1));
//        OreDictionaryUnifier.set(OrePrefix.gem, Materials.InfusedWater, GT_ModHandler.getModItem("Thaumcraft", "ItemShard", 1, 2));
//        OreDictionaryUnifier.set(OrePrefix.gem, Materials.InfusedEarth, GT_ModHandler.getModItem("Thaumcraft", "ItemShard", 1, 3));
//        OreDictionaryUnifier.set(OrePrefix.gem, Materials.InfusedOrder, GT_ModHandler.getModItem("Thaumcraft", "ItemShard", 1, 4));
//        OreDictionaryUnifier.set(OrePrefix.gem, Materials.InfusedEntropy, GT_ModHandler.getModItem("Thaumcraft", "ItemShard", 1, 5));
//        OreDictionaryUnifier.set(OrePrefix.nugget, Materials.Mercury, GT_ModHandler.getModItem("Thaumcraft", "ItemNugget", 1, 5));
//        OreDictionaryUnifier.set(OrePrefix.nugget, Materials.Thaumium, GT_ModHandler.getModItem("Thaumcraft", "ItemNugget", 1, 6));
//        OreDictionaryUnifier.set(OrePrefix.ingot, Materials.Thaumium, GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1, 2));
//        OreDictionaryUnifier.set(OrePrefix.gem, Materials.Mercury, GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1, 3));
//        OreDictionaryUnifier.set(OrePrefix.gem, Materials.Amber, GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1, 6));
//        OreDictionaryUnifier.set(OrePrefix.gem, Materials.Firestone, GT_ModHandler.getModItem("Railcraft", "firestone.raw", 1));
//
//        ItemList.ModularBasicHelmet.set(new ModularArmor_Item(EntityEquipmentSlot.HEAD, "modulararmor_helmet",0, "Modular Helmet"));
//        ItemList.ModularBasicChestplate.set(new ModularArmor_Item(EntityEquipmentSlot.CHEST, "modulararmor_chestplate",0, "Modular Chestplate"));
//        ItemList.ModularBasicLeggings.set(new ModularArmor_Item(EntityEquipmentSlot.LEGS, "modulararmor_leggings",0, "Modular Leggins"));
//        ItemList.ModularBasicBoots.set(new ModularArmor_Item(EntityEquipmentSlot.FEET, "modulararmor_boots", 0, "Modular Boots"));
//        ItemList.ModularElectric1Helmet.set(new ElectricModularArmor1(EntityEquipmentSlot.HEAD, "modularelectric1_helmet",1, "Modular Electric Helmet"));
//        ItemList.ModularElectric1Chestplate.set(new ElectricModularArmor1(EntityEquipmentSlot.CHEST, "modularelectric1_chestplate",1, "Modular Electric Chestplate"));
//        ItemList.ModularElectric1Leggings.set(new ElectricModularArmor1(EntityEquipmentSlot.LEGS, "modularelectric1_leggings",1, "Modular Electric Leggings"));
//        ItemList.ModularElectric1Boots.set(new ElectricModularArmor1(EntityEquipmentSlot.FEET, "modularelectric1_boots",1, "Modular Electric Boots"));
//        ItemList.ModularElectric2Helmet.set(new ElectricModularArmor1(EntityEquipmentSlot.HEAD, "modularelectric2_helmet",2, "Modular Electric Helmet (Tier 2)"));
//        ItemList.ModularElectric2Chestplate.set(new ElectricModularArmor1(EntityEquipmentSlot.CHEST, "modularelectric2_chestplate",2, "Modular Electric Chestplate (Tier 2)"));
//        ItemList.ModularElectric2Leggings.set(new ElectricModularArmor1(EntityEquipmentSlot.LEGS, "modularelectric2_leggings",2, "Modular Electric Leggings (Tier 2)"));
//        ItemList.ModularElectric2Boots.set(new ElectricModularArmor1(EntityEquipmentSlot.FEET, "modularelectric2_boots",2, "Modular Electric Boots (Tier 2)"));
//
//        if (GregTechAPI.sUnification.get(ConfigCategories.specialunificationtargets + "." + "railcraft", "plateIron", true)) {
//            OreDictionaryUnifier.set(OrePrefix.plate, Materials.Iron, GT_ModHandler.getModItem("Railcraft", "part.plate", 1, 0));
//        } else {
//            OreDictionaryUnifier.set(OrePrefix.plate, Materials.Iron, GT_ModHandler.getModItem("Railcraft", "part.plate", 1, 0), false, false);
//        }
//
//        if (GregTechAPI.sUnification.get(ConfigCategories.specialunificationtargets + "." + "railcraft", "plateSteel", true)) {
//            OreDictionaryUnifier.set(OrePrefix.plate, Materials.Steel, GT_ModHandler.getModItem("Railcraft", "part.plate", 1, 1));
//        } else {
//            OreDictionaryUnifier.set(OrePrefix.plate, Materials.Steel, GT_ModHandler.getModItem("Railcraft", "part.plate", 1, 1), false, false);
//        }
//
//        if (GregTechAPI.sUnification.get(ConfigCategories.specialunificationtargets + "." + "railcraft", "plateTinAlloy", true)) {
//            OreDictionaryUnifier.set(OrePrefix.plate, Materials.TinAlloy, GT_ModHandler.getModItem("Railcraft", "part.plate", 1, 2));
//        } else {
//            OreDictionaryUnifier.set(OrePrefix.plate, Materials.TinAlloy, GT_ModHandler.getModItem("Railcraft", "part.plate", 1, 2), false, false);
//        }
//
//        if (GregTechAPI.sUnification.get(ConfigCategories.specialunificationtargets + "." + "railcraft", "plateCopper", true)) {
//            OreDictionaryUnifier.set(OrePrefix.plate, Materials.Copper, GT_ModHandler.getModItem("Railcraft", "part.plate", 1, 3));
//        } else {
//            OreDictionaryUnifier.set(OrePrefix.plate, Materials.Copper, GT_ModHandler.getModItem("Railcraft", "part.plate", 1, 3), false, false);
//        }
//
//        OreDictionaryUnifier.set(OrePrefix.dust, Materials.Cocoa, GT_ModHandler.getModItem("harvestcraft", "cocoapowderItem", 1, 0));
//        OreDictionaryUnifier.set(OrePrefix.dust, Materials.Coffee, ItemList.IC2_CoffeePowder.get(1));
//
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(Materials.Naquadah.getMolten(1000L), OreDictionaryUnifier.get(OrePrefix.cell, Materials.Naquadah, 1L), OreDictionaryUnifier.get(OrePrefix.cell, Materials.Empty, 1L)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(Materials.NaquadahEnriched.getMolten(1000L), OreDictionaryUnifier.get(OrePrefix.cell, Materials.NaquadahEnriched, 1L), OreDictionaryUnifier.get(OrePrefix.cell, Materials.Empty, 1L)));
//        FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData(Materials.Naquadria.getMolten(1000L), OreDictionaryUnifier.get(OrePrefix.cell, Materials.Naquadria, 1L), OreDictionaryUnifier.get(OrePrefix.cell, Materials.Empty, 1L)));
    }
}