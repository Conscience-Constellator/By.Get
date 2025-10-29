package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$Bool;

public interface Get_Bool_By_Bool extends
	Get_Bool_By_Q,
	Get_Q_By_Bool,
	Bool$Bool
{
	@Lin_Dclar
	boolean Get_Bool_By_Bool(boolean By);
		@Override
		@Nevr_Neds_Ovrid
		default boolean Bool$Bool(boolean In){return Get_Bool_By_Bool(In);}
}