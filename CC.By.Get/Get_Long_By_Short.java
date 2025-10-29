package CC.Util.By.Get;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Short$Long;

public interface Get_Long_By_Short extends
	Get_Q_By_Short,
	Get_Long_By_Q,
	Short$Long
{
	@Lin_Dclar
	long Get_Long_By_Short(short By);
		@Override @Nevr_Neds_Ovrid
		default long Short$Long(short In)
		{return Get_Long_By_Short(In);}
}