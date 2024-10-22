package app.revanced.patches.acrobat.premium

import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.AccessFlags
import app.revanced.patcher.fingerprint

internal val hasPremiumFingerprint = fingerprint {
    // com.adobe.libs.services.auth.p.t0(Lcom/adobe/libs/services/utils/SVConstants$SERVICE_TYPE;)Z
    accessFlags(AccessFlags.PUBLIC)
    returns("Z")
    opcodes(
        Opcode.CONST_4,
        Opcode.IF_EQZ,
        Opcode.INVOKE_STATIC,
        Opcode.MOVE_RESULT_OBJECT,
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT,
        Opcode.IF_EQZ,
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT_OBJECT,
        Opcode.SGET_OBJECT,
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT
    )
}