package CC.Util.By.Get;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Int$Bool;

public interface Get_Bool_By_Int extends
	Get_Bool_By_Q,
	Get_Q_By_Int,
	Int$Bool
{
	@Lin_Dclar boolean Get_Bool_By_Int(int By);
		@Override @Nevr_Neds_Ovrid
		default boolean Int$Bool(int In)
		{return Get_Bool_By_Int(In);}
}