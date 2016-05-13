package com.uniquemovement.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IChatComponent;

public class TileEntityCargoBoat extends TileEntity implements IInventory {

        private ItemStack[] inv;

        public TileEntityCargoBoat() {
                inv = new ItemStack[9];
        }

        @Override
        public int getSizeInventory() {
                return inv.length;
        }

        @Override
        public ItemStack getStackInSlot(int slot) {
                return inv[slot];
        }

        @Override
        public void setInventorySlotContents(int slot, ItemStack stack) {
                inv[slot] = stack;
                if (stack != null && stack.stackSize > getInventoryStackLimit()) {
                        stack.stackSize = getInventoryStackLimit();
                }
        }

        @Override
        public ItemStack decrStackSize(int slot, int amt) {
                ItemStack stack = getStackInSlot(slot);
                if (stack != null) {
                        if (stack.stackSize <= amt) {
                                setInventorySlotContents(slot, null);
                        } else {
                                stack = stack.splitStack(amt);
                                if (stack.stackSize == 0) {
                                        setInventorySlotContents(slot, null);
                                }
                        }
                }
                return stack;
        }

        public ItemStack getStackInSlotOnClosing(int slot) {
                ItemStack stack = getStackInSlot(slot);
                if (stack != null) {
                        setInventorySlotContents(slot, null);
                }
                return stack;
        }

        @Override
        public int getInventoryStackLimit() {
                return 64;
        }

        @Override
        public boolean isUseableByPlayer(EntityPlayer player) {
                return worldObj.getTileEntity(pos) == this && player.getDistanceSq(pos) < 64;
        }

        public void openInventory() {
        }

        public void closeInventory() {
        }

        @Override
        public void readFromNBT(NBTTagCompound tagCompound) {
                super.readFromNBT(tagCompound);

                NBTTagList tagList = tagCompound.getTagList("Inventory", 10);
                for (int i = 0; i < tagList.tagCount(); i++) {
                        NBTTagCompound tag = (NBTTagCompound) tagList.getCompoundTagAt(i);
                        byte slot = tag.getByte("Slot");
                        if (slot >= 0 && slot < inv.length) {
                                inv[slot] = ItemStack.loadItemStackFromNBT(tag);
                        }
                }
        }

        @Override
        public void writeToNBT(NBTTagCompound tagCompound) {
                super.writeToNBT(tagCompound);

                NBTTagList itemList = new NBTTagList();
                for (int i = 0; i < inv.length; i++) {
                        ItemStack stack = inv[i];
                        if (stack != null) {
                                NBTTagCompound tag = new NBTTagCompound();
                                tag.setByte("Slot", (byte) i);
                                stack.writeToNBT(tag);
                                itemList.appendTag(tag);
                        }
                }
                tagCompound.setTag("Inventory", itemList);
        }

        public boolean hasCustomInventoryName() {
                return true;
        }

        public String getInventoryName() {
                return "Cargo Boat";
        }

        @Override
        public boolean isItemValidForSlot(int slot, ItemStack itemStack) {
                return true;
        }

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean hasCustomName() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public IChatComponent getDisplayName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ItemStack removeStackFromSlot(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void openInventory(EntityPlayer player) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void closeInventory(EntityPlayer player) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getField(int id) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setField(int id, int value) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getFieldCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
}