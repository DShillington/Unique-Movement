package com.uniquemovement.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class CargoBoatGuiHandler implements IGuiHandler {
        //returns an instance of the Container you made earlier
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) {
                BlockPos pos = null;
				TileEntity tileEntity = world.getTileEntity(pos);
                if(tileEntity instanceof TileEntityCargoBoat){
                        return new ContainerCargoBoat(player.inventory, (TileEntityCargoBoat) tileEntity);
                }
                return null;
        }

        //returns an instance of the Gui you made earlier
        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) {
                BlockPos pos = null;
				TileEntity tileEntity = world.getTileEntity(pos);
                if(tileEntity instanceof TileEntityCargoBoat){
                        return new GuiCargoBoat(player.inventory, (TileEntityCargoBoat) tileEntity);
                }
                return null;

        }
}