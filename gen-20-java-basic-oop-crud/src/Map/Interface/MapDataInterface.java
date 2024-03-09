package Map.Interface;

import Map.POJO.DataSiswa;

import java.util.HashMap;

public class MapDataInterface implements DataInterface<DataSiswa> {

    private HashMap<Integer, DataSiswa> dataMap = new HashMap<>();

    @Override
    public void add(DataSiswa data)
    {
        dataMap.put(data.getNis(), data);
    }

    @Override
    public DataSiswa get(Integer key) {
        return dataMap.get(key);
    }

    @Override
    public void update(Integer key, DataSiswa data)
    {
        dataMap.put(key, data);
    }

    @Override
    public void delete(Integer key)
    {
        dataMap.remove(key);
    }
}
