package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Int$Long;

public interface Get_Long_By_Int extends
	Get_Q_By_Int,
	Get_Long_By_Q,
	Int$Long
{
	@Lin_Dclar
	long Get_Long_By_Int(int By);
		@Override @Nevr_Neds_Ovrid
		default long Int$Long(int In)
		{return Get_Long_By_Int(In);}
}