# AnvilFix

A Minecraft plugin that allows Slimefun items to be used in vanilla anvils.

## Problem
Slimefun blocks its items from being used in vanilla anvils with the message:  
`"Slimefun 4> You cannot use Slimefun items in an anvil!"`

## Solution
This plugin bypasses Slimefun's restriction, allowing players to use Slimefun items in anvils normally.

## Features
- ✅ Allows all Slimefun items in vanilla anvils
- ✅ Works with Slimefun4 Experimental Build 2
- ✅ Compatible with PaperMC 1.21.8
- ✅ No configuration needed
- ✅ Minimal performance impact

## Installation
1. Download `AnvilFix-1.0.jar` from the [Releases](../../releases) page
2. Place it in your server's `plugins/` folder
3. Restart your server
4. Check console for: `[AnvilFix] Slimefun items can now be used in vanilla anvils!`

## Building from Source
```bash
git clone https://github.com/yourusername/AnvilFix.git
cd AnvilFix
mvn clean package