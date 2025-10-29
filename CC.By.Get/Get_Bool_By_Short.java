package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Short$Bool;

public interface Get_Bool_By_Short extends
	Get_Bool_By_Q,
	Get_Q_By_Short,
	Short$Bool
{
	@Lin_Dclar
	boolean Get_Bool_By_Short(short By);
		@Override @Nevr_Neds_Ovrid
		default boolean Short$Bool(short In)
		{return Get_Bool_By_Short(In);}
}