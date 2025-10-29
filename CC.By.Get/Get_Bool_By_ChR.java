package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.ChR$Bool;

public interface Get_Bool_By_ChR extends
	Get_Bool_By_Q,
	Get_Q_By_ChR,
	ChR$Bool
{
	@Lin_Dclar
	boolean Get_Bool_By_ChR(char By);
		@Override @Nevr_Neds_Ovrid
		default boolean ChR$Bool(char In)
		{return Get_Bool_By_ChR(In);}
}