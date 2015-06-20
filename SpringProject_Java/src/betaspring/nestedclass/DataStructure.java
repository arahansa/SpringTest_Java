package betaspring.nestedclass;
/*
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
  
public class DataStructure {
     
    // 배열 생성 
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
     
    public DataStructure() {
    	// 증가하는 정수로 배열을 채운다.
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
     
    public void printEven() {
        // 배열에서 짝수들을 출력
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    // Inner클래스는 Iterator<Integer>인터페이스를 상속하는 
    // DataStructureIterator구현
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 
    private class EvenIterator implements DataStructureIterator {
         // 배열의 처음부터 시작
        private int nextIndex = 0;
        public Integer next() {
            // 배열의 짝수 요소값들을 기록
           // Record a value of an even index of the array
           Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
           // Get the next even element
           // 다음 짝수 요소를 얻는다
           nextIndex += 2;
           return retValue;
       }
        
        public boolean hasNext() {
             // 현재 요소가 배열 마지막 요소인지 검사
            return (nextIndex <= SIZE - 1);
        }        
       
    }
     
    public static void main(String s[]) {
         // 정수값으로 배열을 채우고, 짝수번째 요소들 출력
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}