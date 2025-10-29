package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Byt$Bool;

public interface Get_Bool_By_Byt extends
	Get_Bool_By_Q,
	Get_Q_By_Byt,
	Byt$Bool
{
	@Lin_Dclar boolean Get_Bool_By_Byt(byte By);
		@Override @Nevr_Neds_Ovrid
		default boolean Byt$Bool(byte In)
		{return Get_Bool_By_Byt(In);}
}