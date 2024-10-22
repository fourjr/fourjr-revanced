package app.revanced.patches.acrobat.premium

import app.revanced.patcher.extensions.InstructionExtensions.replaceInstruction
import app.revanced.patcher.extensions.InstructionExtensions.replaceInstructions
import app.revanced.patcher.patch.bytecodePatch

@Suppress("unused")
val unlockPremiumPatch = bytecodePatch(
    name = "Unlock Premium",
    description = "Unlocks all premium features"
) {
    compatibleWith("com.adobe.reader")

    val hasPremiumMatch by hasPremiumFingerprint()
    execute {
        hasPremiumMatch.mutableMethod.replaceInstruction(0, "const/4 v0, 0x1")
        hasPremiumMatch.mutableMethod.replaceInstruction(1, "return v0")
    }
}