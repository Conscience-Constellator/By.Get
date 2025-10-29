package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Long$Bool;

public interface Get_Bool_By_Long extends
	Get_Bool_By_Q,
	Get_Q_By_Long,
	Long$Bool
{
	@Lin_Dclar boolean Get_Bool_By_Long(long By);
		@Override @Nevr_Neds_Ovrid
		default boolean Long$Bool(long In)
		{return Get_Bool_By_Long(In);}
}