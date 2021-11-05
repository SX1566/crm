package crm.mapper;

import crm.pojo.BaseDict;
import org.springframework.stereotype.Repository;

import java.util.List;

//Dao层找不到bean文件 但是已经声明了
@Repository
public interface BaseDictDao {

    //根据数据字典类别代码查询
    List<BaseDict> selectByTypecode(String typecode);
    //根据数据字典ID查询
    BaseDict selectByPrimaryKey(String dictId);
}
