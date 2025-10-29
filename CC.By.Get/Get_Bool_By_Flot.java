package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Flot$Bool;

public interface Get_Bool_By_Flot extends
	Get_Bool_By_Q,
	Get_Q_By_Flot,
	Flot$Bool
{
	@Lin_Dclar
	boolean Get_Bool_By_Flot(float By);
		@Override @Nevr_Neds_Ovrid
		default boolean Flot$Bool(float In)
		{return Get_Bool_By_Flot(In);}
}